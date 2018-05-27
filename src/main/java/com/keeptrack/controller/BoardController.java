package com.keeptrack.controller;

import com.keeptrack.dto.BoardDto;
import com.keeptrack.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardController {
    @Autowired
    BoardService boardService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/boards")
    public List<BoardDto> getBoards(){
        return boardService.getAllBoards();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/deleteBoard")
    public void deleteBoard(@RequestBody Long boardId) {
        boardService.deleteBoard(boardId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/createBoard")
    public void createBoard(@RequestBody BoardDto boardDto) {
        boardService.createBoard(boardDto);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/updateBoard")
    public void updateBoard(@RequestBody BoardDto boardDto){
        boardService.updateBoard(boardDto);
    }
}
