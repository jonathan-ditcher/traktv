package tracktv.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Jonathan Ditcher on 05/08/2018.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Ids {

    private Integer trakt;
    private String slug;
    private Integer tvdb;
    private String imdb;
    private Integer tmdb;
    private Integer tvrage;

    public Ids() {
    }

    public Integer getTrakt() {
        return trakt;
    }

    public void setTrakt(Integer trakt) {
        this.trakt = trakt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getTvdb() {
        return tvdb;
    }

    public void setTvdb(Integer tvdb) {
        this.tvdb = tvdb;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public Integer getTmdb() {
        return tmdb;
    }

    public void setTmdb(Integer tmdb) {
        this.tmdb = tmdb;
    }

    public Integer getTvrage() {
        return tvrage;
    }

    public void setTvrage(Integer tvrage) {
        this.tvrage = tvrage;
    }

    @Override
    public String toString() {
        return "Ids{" +
                "trakt=" + trakt +
                ", slug='" + slug + '\'' +
                ", tvdb=" + tvdb +
                ", imdb='" + imdb + '\'' +
                ", tmdb=" + tmdb +
                ", tvrage=" + tvrage +
                '}';
    }
}
