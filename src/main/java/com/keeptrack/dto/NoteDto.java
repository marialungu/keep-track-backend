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

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public List<NoteItemDto> getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(List<NoteItemDto> noteContent) {
        this.noteContent = noteContent;
    }

    public Date getNoteCreatedAt() {
        return noteCreatedAt;
    }

    public void setNoteCreatedAt(Date noteCreatedAt) {
        this.noteCreatedAt = noteCreatedAt;
    }
}
