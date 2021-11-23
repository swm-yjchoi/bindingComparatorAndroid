package ai.swm.databinding.model;

import java.io.Serializable;

public class MovieModelView implements Serializable {
    private String titleMovie;
    private String desc;
    private String releaseDate;
    private Double rating;

    public MovieModelView(String titleMovie, String desc, String releaseDate, Double rating) {
        this.titleMovie = titleMovie;
        this.desc = desc;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    public String getTitleMovie() {
        return titleMovie;
    }

    public void setTitleMovie(String titleMovie) {
        this.titleMovie = titleMovie;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
