package com.example.anonymouswebsite.service;

import com.example.anonymouswebsite.dto.ArticleDto;
import com.example.anonymouswebsite.entity.Article;
import com.example.anonymouswebsite.repo.ArticleRepository;
import com.example.anonymouswebsite.repo.BoardRepository;
import com.example.anonymouswebsite.repo.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;
    private final BoardRepository boardRepository;
    private  final CommentRepository commentRepository;

    public List<ArticleDto> getAllArticles(){
        List<Article> articles = articleRepository.findAll();
        return articles.stream()
                .map(ArticleDto::fromEntity)
                .toList();
    }

    public List<ArticleDto> getArticlesByBoardId(final Long boardId) {
        List<Article> articles = articleRepository.findByBoardId(boardId);

        return articles.stream()
                .map(ArticleDto::fromEntity)
                .collect(Collectors.toList());
    }



}
