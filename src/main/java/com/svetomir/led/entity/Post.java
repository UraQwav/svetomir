package com.svetomir.led.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @JsonFormat(pattern = "")
    private String title;

    @JsonFormat(pattern = "")
    private String info;

    @Lob
    @JsonFormat(pattern = "")
    private String image;

    @Lob
    @JsonFormat(pattern = "")
    private String text;

    @JsonFormat(pattern = "")
    private String shorting;

    public Long getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public String getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public String getShortText() {
        return shorting;
    }

    public String getDate() {
        return date;
    }

    @JsonFormat(pattern = "")
    private String date;


}
