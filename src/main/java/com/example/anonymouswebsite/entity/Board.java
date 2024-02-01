package com.example.anonymouswebsite.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Table(name = "board")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private String type;
}
