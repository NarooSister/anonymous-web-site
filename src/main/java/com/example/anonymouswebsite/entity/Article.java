package com.example.anonymouswebsite.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "article")
@NoArgsConstructor
@AllArgsConstructor
public class Article extends BaseEntity {
    private String title;

    @ManyToOne
    @JoinColumn(name = "boardId")
    private Board board;

}
