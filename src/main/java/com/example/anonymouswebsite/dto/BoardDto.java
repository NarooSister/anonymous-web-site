package com.example.anonymouswebsite.dto;

import com.example.anonymouswebsite.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.swing.text.html.parser.Entity;

@Getter
@NoArgsConstructor
public class BoardDto {
    private Long id;
    private String type;

    public BoardDto(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    public static BoardDto fromEntity(Board entity){
        return new BoardDto(entity.getId(), entity.getType());
    }
}
