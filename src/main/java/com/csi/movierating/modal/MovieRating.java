/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csi.movierating.modal;

/**
 *
 * @author ratnesh
 */
public class MovieRating {
    
    String movieId;
    String rating;
    String comments;

    public MovieRating(String movieId, String rating, String comments) {
        this.movieId = movieId;
        this.rating = rating;
        this.comments = comments;
    }
    
    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
}
