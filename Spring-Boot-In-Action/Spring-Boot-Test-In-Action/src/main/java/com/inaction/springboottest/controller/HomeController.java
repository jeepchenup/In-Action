package com.inaction.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 *
 * @author pc.chen
 */
@RequestMapping("/home")
@RestController
public class HomeController {

    @GetMapping("/greet")
    public String greeting() {
        return "Hello World";
    }
}
