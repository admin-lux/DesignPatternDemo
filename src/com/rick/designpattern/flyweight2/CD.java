package com.rick.designpattern.flyweight2;

/**
 * Created by MyPC on 2017/6/7.
 */
public class CD {

    private String title;
    private String year;
    private Artist artist;

    public CD() {
    }

    public CD(String title, String year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
