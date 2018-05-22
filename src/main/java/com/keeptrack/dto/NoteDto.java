package com.keeptrack.dto;

import com.keeptrack.entity.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Builder
@Getter
@Setter
public class NoteDto {
    private Long noteId;
    private Long boardId;
    private String noteName;
    private List<NoteItemDto> noteContent;
    private Date noteCreatedAt;

}
