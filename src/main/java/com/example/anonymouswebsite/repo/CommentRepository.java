package com.example.anonymouswebsite.repo;

import com.example.anonymouswebsite.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
