package tracktv.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Jonathan Ditcher on 05/08/2018.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class TrackTvResponse {
/*
    private Integer watchers;

    public TrackTvResponse() {
    }

    public Integer getWatchers() {
        return watchers;
    }

    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    @Override
    public String toString() {
        return "TrackTvResponse{" +
                "watchers=" + watchers +
                '}';
    }
    */
}
