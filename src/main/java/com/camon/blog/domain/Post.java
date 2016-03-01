package com.camon.blog.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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

    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false)
    private String title;

    @Size(max = 50)
    private String subtitle;

    @NotNull
    @Size(min = 1, max = 1000)
    @Column(nullable = false, length = 1000)
    private String content;

    private String writer;

    private Date regDate;

}
