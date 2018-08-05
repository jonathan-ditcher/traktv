package tracktv;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tracktv.dto.MovieInfo;
import tracktv.dto.MovieResponse;
import tracktv.dto.ShowInfo;
import tracktv.dto.ShowResponse;

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

    private final ObjectMapper mapper = new ObjectMapper();
    private final OkHttpClient client = new OkHttpClient();

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
        HttpUrl.Builder httpBuider = HttpUrl.parse(API_ENDPOINT + url).newBuilder();
        if(extended)
            httpBuider.addQueryParameter("extended", "full");
        if(pageNum != null)
            httpBuider.addQueryParameter("page", String.valueOf(pageNum));
        if(limit != null)
            httpBuider.addQueryParameter("limit", String.valueOf(limit));

        Headers headers = new Headers.Builder()
                .add("trakt-api-version", "2")
                .add("trakt-api-key", this.clientId)
                .build();

        Request request = new Request.Builder()
                .headers(headers)
                .url(url)
                .get()
                .build();

        Response response = this.client.newCall(request).execute();

        String out = response.body().string();
        logger.trace("out[{}]", out);

        ShowResponse showResponse = new ShowResponse();

        JavaType javaType = this.mapper.getTypeFactory().constructCollectionType(List.class, ShowInfo.class);
        List<ShowInfo> shows = this.mapper.readValue(out, javaType);
        showResponse.setShows(shows);
        return showResponse;
    }

    private MovieResponse getMovieResponse(String url, boolean extended, Integer pageNum, Integer limit) throws IOException {
        logger.trace("url[{}] extended[{}] pageNum[{}] limit[{}]", url, extended, pageNum, limit);
        HttpUrl.Builder httpBuider = HttpUrl.parse(API_ENDPOINT + url).newBuilder();
        if(extended)
            httpBuider.addQueryParameter("extended", "full");
        if(pageNum != null)
            httpBuider.addQueryParameter("page", String.valueOf(pageNum));
        if(limit != null)
            httpBuider.addQueryParameter("limit", String.valueOf(limit));

        Headers headers = new Headers.Builder()
                .add("trakt-api-version", "2")
                .add("trakt-api-key", this.clientId)
                .build();

        Request request = new Request.Builder()
                .headers(headers)
                .url(httpBuider.build())
                .get()
                .build();

        Response response = this.client.newCall(request).execute();

        String out = response.body().string();
        logger.trace("out[{}]", out);

        MovieResponse movieResponse = new MovieResponse();

        JavaType javaType = this.mapper.getTypeFactory().constructCollectionType(List.class, MovieInfo.class);
        List<MovieInfo> movies = this.mapper.readValue(out, javaType);
        movieResponse.setMovies(movies);
        return movieResponse;
    }
}
