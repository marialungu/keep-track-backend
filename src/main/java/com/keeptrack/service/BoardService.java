package com.keeptrack.service;

import com.keeptrack.dto.BoardDto;
import com.keeptrack.dto.BoardDtoTransformer;
import com.keeptrack.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BoardService {
    @Autowired
    BoardRepository boardRepository;

    @Autowired
    BoardDtoTransformer boardDtoTransformer;

    public List<BoardDto> getAllBoards() {
        return boardRepository.findAll().stream()
                .map( board -> boardDtoTransformer.transform(board))
                .collect(Collectors.toList());
    }
}
