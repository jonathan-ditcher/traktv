package tracktv.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Jonathan Ditcher on 05/08/2018.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MovieInfo {

    private Integer watchers;
    private Integer watcher_count;
    private Integer play_count;
    private Integer collected_count;
    private Integer collector_count;

    private Movie movie;

    public MovieInfo() {
    }

    public Integer getWatchers() {
        return watchers;
    }

    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getWatcher_count() {
        return watcher_count;
    }

    public void setWatcher_count(Integer watcher_count) {
        this.watcher_count = watcher_count;
    }

    public Integer getPlay_count() {
        return play_count;
    }

    public void setPlay_count(Integer play_count) {
        this.play_count = play_count;
    }

    public Integer getCollected_count() {
        return collected_count;
    }

    public void setCollected_count(Integer collected_count) {
        this.collected_count = collected_count;
    }

    public Integer getCollector_count() {
        return collector_count;
    }

    public void setCollector_count(Integer collector_count) {
        this.collector_count = collector_count;
    }

    @Override
    public String toString() {
        return "MovieInfo{" +
                "watchers=" + watchers +
                ", watcher_count=" + watcher_count +
                ", play_count=" + play_count +
                ", collected_count=" + collected_count +
                ", collector_count=" + collector_count +
                ", movie=" + movie +
                '}';
    }
}
