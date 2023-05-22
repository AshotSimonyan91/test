package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ashot Simonyan on 21.05.23.
 */

@Controller
@RequestMapping("/")
public class MainController {


    @GetMapping
    public String indexPage() {
        return "index";
    }
}
