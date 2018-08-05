package tracktv.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Jonathan Ditcher on 05/08/2018.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MovieResponse extends TrackTvResponse {

    private List<MovieInfo> movies;

    public MovieResponse() {
    }

    public List<MovieInfo> getMovies() {
        return movies;
    }

    public void setMovies(List<MovieInfo> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "MovieResponse{" +
                "movies=" + movies +
                "} " + super.toString();
    }
}
