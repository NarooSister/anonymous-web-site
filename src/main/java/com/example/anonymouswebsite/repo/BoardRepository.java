package com.example.anonymouswebsite.repo;

import com.example.anonymouswebsite.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
