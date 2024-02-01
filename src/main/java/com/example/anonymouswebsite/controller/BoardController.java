package com.example.anonymouswebsite.controller;

import com.example.anonymouswebsite.dto.ArticleDto;
import com.example.anonymouswebsite.dto.BoardDto;
import com.example.anonymouswebsite.entity.Article;
import com.example.anonymouswebsite.repo.BoardRepository;
import com.example.anonymouswebsite.service.ArticleService;
import com.example.anonymouswebsite.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardController {
    private final BoardService boardService;
    private final ArticleService articleService;

    @GetMapping
    public String boards(Model model){
        List<BoardDto> boards = boardService.getBoards();
        List<ArticleDto> articles = articleService.getAllArticles();
        model.addAttribute("boards", boards);
        model.addAttribute("articles", articles);
        return "boards";
    }

    @GetMapping("/{id}")
    public String board(
            @PathVariable(name = "id")
            Long id,
            Model model
    ){
        BoardDto boardDto = boardService.getBoard(id);
        List<ArticleDto> articles = articleService.getArticlesByBoardId(id);
        model.addAttribute("board", boardDto);
        model.addAttribute("articles", articles);
        return "boardDetail";
    }


}
