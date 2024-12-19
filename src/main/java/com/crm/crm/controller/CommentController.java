package com.crm.crm.controller;

import com.crm.crm.Repository.CommentRepository;
import com.crm.crm.Repository.PostRepository;
import com.crm.crm.entity.Comment;
import com.crm.crm.entity.Post;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    private PostRepository postRepository;
    private CommentRepository commentRepository;

    public CommentController(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    public String createComment(@RequestBody Comment comment, @RequestParam long postId) {
Post post = postRepository.findById(postId).get();
    Comment.Post(post);
    CommentRepository.Save(comment);
    return "comment";
    }
}