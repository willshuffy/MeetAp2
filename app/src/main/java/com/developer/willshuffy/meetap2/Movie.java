//ambil dari api movieDB
//https://api.themoviedb.org/3/movie/now_playing?api_key=a005e693372c8654eafa888c348d7117&language=en-US


package com.developer.willshuffy.meetap2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

import java.util.List;

 class Dates implements Parcelable
{

    private String maximum;
    private String minimum;
    public final static Parcelable.Creator<Dates> CREATOR = new Creator<Dates>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Dates createFromParcel(Parcel in) {
            return new Dates(in);
        }

        public Dates[] newArray(int size) {
            return (new Dates[size]);
        }

    }
            ;

    protected Dates(Parcel in) {
        this.maximum = ((String) in.readValue((String.class.getClassLoader())));
        this.minimum = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Dates() {
    }

    public String getMaximum() {
        return maximum;
    }

    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(maximum);
        dest.writeValue(minimum);
    }

    public int describeContents() {
        return 0;
    }

}

 class Movie implements Parcelable
{

    private List<Result> results = null;
    private int page;
    private int total_results;
    private Dates dates;
    private int total_pages;
    public final static Parcelable.Creator<Movie> CREATOR = new Creator<Movie>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        public Movie[] newArray(int size) {
            return (new Movie[size]);
        }

    }
            ;

    protected Movie(Parcel in) {
        in.readList(this.results, (com.developer.willshuffy.meetap2.Result.class.getClassLoader()));
        this.page = ((int) in.readValue((int.class.getClassLoader())));
        this.total_results = ((int) in.readValue((int.class.getClassLoader())));
        this.dates = ((Dates) in.readValue((Dates.class.getClassLoader())));
        this.total_pages = ((int) in.readValue((int.class.getClassLoader())));
    }

    public Movie() {
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(results);
        dest.writeValue(page);
        dest.writeValue(total_results);
        dest.writeValue(dates);
        dest.writeValue(total_pages);
    }

    public int describeContents() {
        return 0;
    }

}

 class Result implements Parcelable
{

    private int vote_count;
    private int id;
    private boolean video;
    private float vote_average;
    private String title;
    private float popularity;
    private String poster_path;
    private String original_language;
    private String original_title;
    private List<Integer> genre_ids = null;
    private String backdrop_path;
    private boolean adult;
    private String overview;
    private String release_date;
    public final static Parcelable.Creator<Result> CREATOR = new Creator<Result>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Result createFromParcel(Parcel in) {
            return new Result(in);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    }
            ;

    protected Result(Parcel in) {
        this.vote_count = ((int) in.readValue((int.class.getClassLoader())));
        this.id = ((int) in.readValue((int.class.getClassLoader())));
        this.video = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.vote_average = ((float) in.readValue((float.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.popularity = ((float) in.readValue((float.class.getClassLoader())));
        this.poster_path = ((String) in.readValue((String.class.getClassLoader())));
        this.original_language = ((String) in.readValue((String.class.getClassLoader())));
        this.original_title = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.genre_ids, (java.lang.Integer.class.getClassLoader()));
        this.backdrop_path = ((String) in.readValue((String.class.getClassLoader())));
        this.adult = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.overview = ((String) in.readValue((String.class.getClassLoader())));
        this.release_date = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Result() {
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public float getVote_average() {
        return vote_average;
    }

    public void setVote_average(float vote_average) {
        this.vote_average = vote_average;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public List<Integer> getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(List<Integer> genre_ids) {
        this.genre_ids = genre_ids;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(vote_count);
        dest.writeValue(id);
        dest.writeValue(video);
        dest.writeValue(vote_average);
        dest.writeValue(title);
        dest.writeValue(popularity);
        dest.writeValue(poster_path);
        dest.writeValue(original_language);
        dest.writeValue(original_title);
        dest.writeList(genre_ids);
        dest.writeValue(backdrop_path);
        dest.writeValue(adult);
        dest.writeValue(overview);
        dest.writeValue(release_date);
    }

    public int describeContents() {
        return 0;
    }

}