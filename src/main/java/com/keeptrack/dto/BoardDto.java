package com.keeptrack.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BoardDto {
    private Long boardId;
    private String boardName;
    private String boardColor;
}
