/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csi.movierating.modal;

import java.util.List;

/**
 *
 * @author ratnesh
 */
public class UserRatings {
    
    String id;
    List<MovieRating> userMovieRatings;
    Integer count;

    public UserRatings(String id, List<MovieRating> userMovieRatings, Integer count) {
        this.id = id;
        this.userMovieRatings = userMovieRatings;
        this.count = count;
    }

    public UserRatings() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<MovieRating> getUserMovieRatings() {
        return userMovieRatings;
    }

    public void setUserMovieRatings(List<MovieRating> userMovieRatings) {
        this.userMovieRatings = userMovieRatings;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    
}
