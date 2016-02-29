package com.camon.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jooyong on 2016-02-29.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "jooyong");
        return "hello/index";
    }

    @RequestMapping("/blog")
    public String blog(Model model) {
        return "hello/blog";
    }

    @RequestMapping("/post")
    public String post(Model model) {
        return "hello/post";
    }
}
