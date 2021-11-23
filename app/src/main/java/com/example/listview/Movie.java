package com.example.listview;

/**
 * The class represents a movie.
 */
public class Movie {

    private int image;
    private String name;
    private String release;

    /**
     * Constructor that sets values for the variables.
     * @param image is the image of the movie.
     * @param name is the name of the movie.
     * @param release is the release year of the movie.
     */
    public Movie(int image, String name, String release) {

        this.image = image;
        this.name = name;
        this.release = release;
    }

    public int getImage() {

        return image;
    }

    public String getName() {

        return name;
    }

    public String getRelease() {

        return release;
    }
}
