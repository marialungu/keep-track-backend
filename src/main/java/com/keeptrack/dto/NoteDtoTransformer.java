package com.keeptrack.dto;

import com.keeptrack.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NoteDtoTransformer {

    @Autowired
    private NoteItemTransformer itemTransformer;

    public NoteDto transform(Note input){
        return NoteDto.builder()
                .noteId(input.getNoteId())
                .noteName(input.getNoteName())
                .noteCreatedAt(input.getNoteCreatedAt())
                .noteContent(itemTransformer.transform(input.getNoteContent()))
                .build();
    }
}
