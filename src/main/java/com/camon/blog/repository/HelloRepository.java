package com.camon.blog.repository;

import com.camon.blog.domain.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jooyong on 2016-02-29.
 */
public interface HelloRepository extends JpaRepository<Hello, Integer> {


}
