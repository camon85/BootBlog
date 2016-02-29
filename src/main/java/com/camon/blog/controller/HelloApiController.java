package com.camon.blog.controller;

import com.camon.blog.domain.Hello;
import com.camon.blog.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jooyong on 2016-02-29.
 */
@RestController
public class HelloApiController {

    @Autowired
    private HelloRepository repository;

    @RequestMapping("/add")
    public Hello add(Hello hello) {
        repository.save(hello);

        return hello;
    }

    @RequestMapping("/list")
    public List<Hello> list() {
        return repository.findAll();
    }

}
