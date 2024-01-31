package com.example.anonymouswebsite.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "comment")
@NoArgsConstructor
@AllArgsConstructor
public class Comment extends BaseEntity{
    private Long articleId;
}
