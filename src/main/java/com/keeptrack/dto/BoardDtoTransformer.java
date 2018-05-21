package com.keeptrack.dto;

import com.keeptrack.entity.Board;
import org.springframework.stereotype.Component;

@Component
public class BoardDtoTransformer {

    public BoardDto transform(Board board){

        BoardDto boardDto = BoardDto.builder()
                .boardId(board.getBoardId())
                .boardName(board.getBoardName())
                .boardColor(board.getBoardColor())
                .build();
        return boardDto;
    }
}
