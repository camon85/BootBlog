package com.camon.blog.controller;

import com.camon.blog.domain.Post;
import com.camon.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

/**
 * Created by jooyong on 2016-03-01.
 */
@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @RequestMapping
    public String index(Model model) {
        List<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blog/list";
    }

    @RequestMapping("/{postId}")
    public String view(@PathVariable int postId, Model model) {
        Post post = postRepository.findOne(postId);
        model.addAttribute("post", post);
        return "blog/post";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String writeForm() {
        return "blog/post_form";
    }

    @RequestMapping(value = "/{postId}/edit", method = RequestMethod.GET)
    public String editForm(@PathVariable int postId, Model model) {
        Post post = postRepository.findOne(postId);
        model.addAttribute("post", post);
        return "blog/post_form";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Post post) {
        post.setRegDate(new Date());
        Post save = postRepository.save(post);
        return "redirect:/posts/" + save.getId();
    }

    @RequestMapping("/dummyAdd")
    public String dummyAdd() {
        Post post = new Post();
        post.setTitle("테스트 제목");
        post.setContent("본문");
        post.setWriter("jooyong");
        post.setRegDate(new Date());
        postRepository.save(post);
        return "redirect:/posts";
    }


}
