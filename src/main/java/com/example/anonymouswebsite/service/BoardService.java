package com.example.anonymouswebsite.service;

import com.example.anonymouswebsite.dto.BoardDto;
import com.example.anonymouswebsite.entity.Board;
import com.example.anonymouswebsite.repo.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public List<BoardDto> getBoards(){
        List<BoardDto> boardDtos = new ArrayList<>();
        for (Board board : boardRepository.findAll()){
            boardDtos.add(BoardDto.fromEntity(board));
        }
        return boardDtos;
    }

    public BoardDto getBoard(Long boardId){
        Board board = boardRepository.findById(boardId)
                .orElseThrow(() -> new NoSuchElementException("게시판이 존재하지 않습니다."));
        return BoardDto.fromEntity(board);
    }
}
