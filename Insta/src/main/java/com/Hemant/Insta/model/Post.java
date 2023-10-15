package com.Hemant.Insta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Post {
    @Id
    private Integer postId;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private String postData;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
