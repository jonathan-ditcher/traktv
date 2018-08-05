package tracktv.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.Set;

/**
 * Created by Jonathan Ditcher on 05/08/2018.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Movie extends Show {

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{} " + super.toString();
    }
}
