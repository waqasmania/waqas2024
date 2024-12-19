package com.crm.crm.Repository;

import com.crm.crm.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    static void Save(Comment comment) {
    }
}