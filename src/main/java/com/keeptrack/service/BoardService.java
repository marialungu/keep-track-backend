package com.keeptrack.service;

import com.keeptrack.dto.BoardDto;
import com.keeptrack.dto.BoardDtoTransformer;
import com.keeptrack.entity.Board;
import com.keeptrack.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BoardService {
    BoardRepository boardRepository;
    BoardDtoTransformer boardDtoTransformer;

    public List<BoardDto> findBoards() {
        BoardDto boardDto;
        List<BoardDto> boardDtoList = new ArrayList<>();
        List<Board> boardList = boardRepository.findAll();

        for(Board board : boardList) {
            boardDto = boardDtoTransformer.transform(board);
            boardDtoList.add(boardDto);
        }
        return boardDtoList;
    }
}
