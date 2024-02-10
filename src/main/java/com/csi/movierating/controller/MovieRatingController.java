/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csi.movierating.controller;

import com.csi.movierating.modal.MovieRating;
import com.csi.movierating.modal.UserRatings;
import com.csi.movierating.props.DataSource;
import com.csi.movierating.props.Greeting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ratnesh
 */
@RestController
@RefreshScope
@RequestMapping("/api/v1")
public class MovieRatingController {
    
    Logger logger = LoggerFactory.getLogger(MovieRatingController.class);
    
    @Autowired
    private DataSource dataSource;
    
    @Autowired
    private Greeting greeting;
      
    @GetMapping("/props/greeting")
    public List<String> getGreetingProps() {
        List<String> dataList = new ArrayList<>();
        dataList.add(greeting.getId());
        dataList.add(greeting.getName());
        dataList.add(greeting.getDescription());
        dataList.add(greeting.getMessage());
        return dataList;
    }
    
    @Value("${greeting.id:defaultGreetingId}")
    String id;
    @Value("${greeting.name:defaultName}")
    String name;
    @Value("${greeting.description:defaultDescription}")
    String description;
    @Value("${greeting.message:defaultMessage}")
    String message;
    
    @GetMapping("/props/greetingvalue")
    public List<String> getGreetingProps1() {
        List<String> dataList = new ArrayList<>();
        dataList.add(id);
        dataList.add(name);
        dataList.add(description);
        dataList.add(message);
        return dataList;
    }
    
    @GetMapping("/props/datasource")
    public List<String> getDataSourceProps() {
        List<String> dataList = new ArrayList<>();
        dataList.add(dataSource.getUrl());
        dataList.add(dataSource.getUsername());
        dataList.add(dataSource.getPassword());
        return dataList;
    }
    
    @RequestMapping("/rating/{movieId}")
    public List<MovieRating> getMovieRating(@PathVariable("movieId") String movieId) {
        return Collections.singletonList(
        new MovieRating(movieId, "4", "veri nice movie")
        );
    }
    
    @RequestMapping("/user/{userId}")
    public UserRatings getUserRatings(@PathVariable("userId") String userId) {
        logger.info("Inside getUserRatings method with user Id : "+userId);
        List<MovieRating> ratings = Arrays.asList(
        new MovieRating("101", "4", "Good Movie"),
        new MovieRating("102", "5", "Very Nice Movie"),
        new MovieRating("103", "4", "Nice Movie"),
        new MovieRating("104", "3", "average")
        );
        UserRatings userRatings = new UserRatings();
        userRatings.setUserMovieRatings(ratings);
        userRatings.setCount(ratings.size());
        logger.info("OutSide getUserRatings method with user Id : "+userId);
        return userRatings;
        
    }
}
