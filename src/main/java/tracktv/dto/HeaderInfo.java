package tracktv.dto;

/**
 * Created by Jonathan Ditcher on 05/08/2018.
 */
public class HeaderInfo {

    private Integer watchers;
    private Integer watcher_count;
    private Integer play_count;
    private Integer collected_count;
    private Integer collector_count;

    public Integer getWatchers() {
        return watchers;
    }

    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
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
        return "AbstractShowInfo{" +
                "watchers=" + watchers +
                ", watcher_count=" + watcher_count +
                ", play_count=" + play_count +
                ", collected_count=" + collected_count +
                ", collector_count=" + collector_count +
                '}';
    }
}
