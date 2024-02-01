package com.example.anonymouswebsite.dto;

import com.example.anonymouswebsite.entity.Article;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ArticleDto {
    private Long id;
    private String title;
    private String content;
    private Long boardId;
    private String boardType;

    public ArticleDto(Long id, String title, String content, Long boardId, String boardType) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.boardId = boardId;
        this.boardType = boardType;
    }

    public static ArticleDto fromEntity(Article entity){
        return new ArticleDto(
                entity.getId(),
                entity.getTitle(),
                entity.getContent(),
                entity.getBoard().getId(),
                entity.getBoard().getType()
        );
    }
}
