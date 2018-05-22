package com.keeptrack.controller;

import com.keeptrack.dto.BoardDto;
import com.keeptrack.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("/boards")
    public List<BoardDto> getBoards(){
        return boardService.getAllBoards();
    }

    @DeleteMapping("/deleteBoard")
    public void deleteBoard(@RequestBody Long boardId) {
        boardService.deleteBoard(boardId);
    }
}
