package tracktv.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import tracktv.dto.ShowInfo;

import java.util.List;

/**
 * Created by Jonathan Ditcher on 05/08/2018.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ShowResponse extends TrackTvResponse {

    private List<ShowInfo> shows;

    public ShowResponse() {
    }

    public List<ShowInfo> getShows() {
        return shows;
    }

    public void setShows(List<ShowInfo> shows) {
        this.shows = shows;
    }

    @Override
    public String toString() {
        return "ShowResponse{" +
                "shows=" + shows +
                "} " + super.toString();
    }
}
