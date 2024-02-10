/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csi.movierating.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ratnesh
 */
@Controller
@RequestMapping("/test")
public class TestController {
    
    @GetMapping("/data")
    public List<String> getGreetingProps() {
        List<String> dataList = new ArrayList<>();
        dataList.add("1");
        dataList.add("2");
        dataList.add("3");
        dataList.add("4");
        return dataList;
    }
}
