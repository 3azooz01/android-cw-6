package com.example.newclass;

public class Movies {
    private String title;
    private String mainActor;
    private String genre;
    private double movieRate;
    private int pgRate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(double movieRate) {
        this.movieRate = movieRate;
    }

    public int getPgRate() {
        return pgRate;
    }

    public void setPgRate(int pgRate) {
        this.pgRate = pgRate;
    }

    public Movies(String title, String mainActor, String genre, double movieRate, int pgRate) {
        this.title = title;
        this.mainActor = mainActor;
        this.genre = genre;
        this.movieRate = movieRate;
        this.pgRate = pgRate;
    }
}

