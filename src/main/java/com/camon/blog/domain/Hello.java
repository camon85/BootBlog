package com.camon.blog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jooyong on 2016-02-29.
 */

@Entity
@Data
public class Hello {

    @Id
    @GeneratedValue
    private int id;

    private String name;

}
