package tracktv;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.Url;
import tracktv.dto.MovieInfo;
import tracktv.dto.ShowInfo;

import java.util.List;

/**
 * Created by Jonathan Ditcher on 12/02/2019.
 */
public interface TrakTvService {

    @Headers({
            "trakt-api-version: 2"
    })
    @GET
    Call<List<ShowInfo>> getShows(@Url String url,
                                  @Query("extended") String extended,
                                  @Query("page") Integer page,
                                  @Query("limit") Integer limit);

    @Headers({
            "trakt-api-version: 2"
    })
    @GET
    Call<List<MovieInfo>> getMovies(@Url String url,
                                    @Query("extended") String extended,
                                    @Query("page") Integer page,
                                    @Query("limit") Integer limit);
}
