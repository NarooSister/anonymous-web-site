package com.example.anonymouswebsite.repo;

import com.example.anonymouswebsite.dto.ArticleDto;
import com.example.anonymouswebsite.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findByBoardId(Long boardId);
}
