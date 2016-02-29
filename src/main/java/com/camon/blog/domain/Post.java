package com.camon.blog.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by jooyong on 2016-03-01.
 */
@Entity
@Data
public class Post {

    @Id
    @GeneratedValue
    private int id;

    private String title;

    @Column(length = 100)
    private String content;

    private String writer;

    private Date regDate;

}
