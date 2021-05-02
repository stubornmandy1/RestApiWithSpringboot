/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringbootEx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Manjinder
 */
@RestController

public class WebServicesEx1 {
    @RequestMapping ("/")
    public String show(){
        return "method requesting mapping";
    }
    @RequestMapping ("/Hello")
    public String disp(){
        return "Method 2";
    }
}
