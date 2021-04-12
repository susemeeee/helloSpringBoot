/*
 * HelloWorldController.java
 * Author : 박찬형
 * Created Date : 2021-04-12
 */
package kr.ac.hansung.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    public String sayHello(){
        return "index";
    }
}
