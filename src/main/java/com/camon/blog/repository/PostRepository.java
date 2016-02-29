package com.camon.blog.repository;

import com.camon.blog.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jooyong on 2016-03-01.
 */
public interface PostRepository extends JpaRepository<Post, Integer> {
}
