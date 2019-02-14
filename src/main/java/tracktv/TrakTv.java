package tracktv;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import tracktv.dto.MovieInfo;
import tracktv.dto.ShowInfo;
import tracktv.dto.response.MovieResponse;
import tracktv.dto.response.ShowResponse;

import java.io.IOException;
import java.util.List;

/**
 * Created by Jonathan Ditcher on 05/08/2018.
 */
public class TrakTv {

    private static final Logger logger = LoggerFactory.getLogger(TrakTv.class);
    private static final String API_ENDPOINT = "https://api.trakt.tv/";

    private String clientId;
    private String clientSecret;

    public TrakTv(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public ShowResponse getTrendingShows() throws IOException {
        return this.getShowResponse("shows/trending");
    }

    public ShowResponse getPopularShows() throws IOException {
        return this.getShowResponse("shows/popular");
    }

    public ShowResponse getPlayedShows() throws IOException {
        String period = "weekly";
        return this.getShowResponse("shows/played/" + period);
    }

    public MovieResponse getTrendingMovies() throws IOException {
        return this.getMovieResponse("movies/trending");
    }

    public MovieResponse getPopularMovies() throws IOException {
        return this.getMovieResponse("movies/popular");
    }

    public MovieResponse getPlayedMovies() throws IOException {
        String period = "weekly";
        return this.getMovieResponse("movies/played/" + period);
    }

    private ShowResponse getShowResponse(String url) throws IOException {
        return this.getShowResponse(url, true, null, null);
    }

    private MovieResponse getMovieResponse(String url) throws IOException {
        return this.getMovieResponse(url, true, null, null);
    }

    private ShowResponse getShowResponse(String url, boolean extended, Integer pageNum, Integer limit) throws IOException {
        TrakTvService service = TrakTvServiceGenerator.createService(TrakTvService.class, this.clientId);
        List<ShowInfo> shows =  service.getShows(url, extended ? "full" : null, pageNum, limit).execute().body();

        ShowResponse showResponse = new ShowResponse();
        showResponse.setShows(shows);
        return showResponse;
    }

    private MovieResponse getMovieResponse(String url, boolean extended, Integer pageNum, Integer limit) throws IOException {
        logger.trace("url[{}] extended[{}] pageNum[{}] limit[{}]", url, extended, pageNum, limit);

        TrakTvService service = TrakTvServiceGenerator.createService(TrakTvService.class, this.clientId);
        List<MovieInfo> movies =  service.getMovies(url, extended ? "full" : null, pageNum, limit).execute().body();

        MovieResponse movieResponse = new MovieResponse();
        movieResponse.setMovies(movies);
        return movieResponse;
    }

    public static class TrakTvServiceGenerator {

        private static Retrofit.Builder builder  = new Retrofit.Builder()
                .baseUrl(API_ENDPOINT)
                .addConverterFactory(JacksonConverterFactory.create());

        private static Retrofit retrofit = builder.build();

        private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        public static <S> S createService(Class<S> serviceClass) {
            return retrofit.create(serviceClass);
        }

        public static <S> S createService(Class<S> serviceClass, String clientId) {
            httpClient.interceptors().clear();
            httpClient.addInterceptor( chain -> {
                Request original = chain.request();
                Request request = original.newBuilder()
                        .header("trakt-api-key", clientId)
                        .build();
                return chain.proceed(request);
            });
            builder.client(httpClient.build());
            retrofit = builder.build();

            return retrofit.create(serviceClass);
        }
    }

}
