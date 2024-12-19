package com.crm.crm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "descriptiion", length = 5000)
    private String descriptiion;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public static void Post(Post post) {
    }
}