/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.csi.movierating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @author ratnesh
 */
@SpringBootApplication
@EnableEurekaClient
public class CsiMovieRating {

    public static void main(String[] args) {
        SpringApplication.run(CsiMovieRating.class, args);
    }
}
