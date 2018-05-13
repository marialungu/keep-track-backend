package com.keeptrack.dto;

import com.keeptrack.entity.Board;
import com.keeptrack.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BoardDtoTransformer {
    BoardRepository boardRepository;

    public BoardDto transform(Board board){

        BoardDto boardDto = BoardDto.builder()
                .boardId(board.getBoardId())
                .boardName(board.getBoardName())
                .boardColor(board.getBoardColor())
                .build();
        return boardDto;
    }
}
