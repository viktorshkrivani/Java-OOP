package com.example.fmov;

public class Movie {
    private String title;
    private String year;

    public Movie(String title, String year) {
        this.title = title;
        this.year = year;
    }
    public String getTitle(){
        return title;
    }

    public String getYear() {
        return year;
    }

    public String toString() {
        return title + " " + year;
    }
}
