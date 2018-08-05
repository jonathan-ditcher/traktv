package tracktv.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.Set;

/**
 * Created by Jonathan Ditcher on 05/08/2018.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Show {

    private String title;
    private Integer year;
    private Ids ids;
    private String overview;
    private Date first_aired;
    private Air airs;
    private Integer runtime;
    private String certification;
    private String network;
    private String country;
    private String trailer;
    private String homepage;
    private String status;
    private Double rating;
    private Integer votes;
    private Integer comment_count;
    private Date updated_at;
    private String language;
    private Set<String> available_translations;
    private Set<String> genres;
    private Integer aired_episodes;

    public Show() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Ids getIds() {
        return ids;
    }

    public void setIds(Ids ids) {
        this.ids = ids;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Date getFirst_aired() {
        return first_aired;
    }

    public void setFirst_aired(Date first_aired) {
        this.first_aired = first_aired;
    }

    public Air getAirs() {
        return airs;
    }

    public void setAirs(Air airs) {
        this.airs = airs;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Set<String> getAvailable_translations() {
        return available_translations;
    }

    public void setAvailable_translations(Set<String> available_translations) {
        this.available_translations = available_translations;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void setGenres(Set<String> genres) {
        this.genres = genres;
    }

    public Integer getAired_episodes() {
        return aired_episodes;
    }

    public void setAired_episodes(Integer aired_episodes) {
        this.aired_episodes = aired_episodes;
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", ids=" + ids +
                ", overview='" + overview + '\'' +
                ", first_aired=" + first_aired +
                ", airs=" + airs +
                ", runtime=" + runtime +
                ", certification='" + certification + '\'' +
                ", network='" + network + '\'' +
                ", country='" + country + '\'' +
                ", trailer='" + trailer + '\'' +
                ", homepage='" + homepage + '\'' +
                ", status='" + status + '\'' +
                ", rating=" + rating +
                ", votes=" + votes +
                ", comment_count=" + comment_count +
                ", updated_at=" + updated_at +
                ", language='" + language + '\'' +
                ", available_translations=" + available_translations +
                ", genres=" + genres +
                ", aired_episodes=" + aired_episodes +
                '}';
    }
}
