package com.keeptrack.dto;

import com.keeptrack.entity.Note;
import com.keeptrack.entity.NoteItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NoteDtoTransformer {

    @Autowired
    private NoteItemTransformer itemTransformer;


    public NoteDto transform(Note input, List<NoteItem> items){
        return NoteDto.builder()
                .noteId(input.getNoteId())
                .noteName(input.getNoteName())
                .boardId(input.getBoard().getBoardId())
                .noteCreatedAt(input.getNoteCreatedAt())
                .noteContent(itemTransformer.listTransform(items))
                .build();
    }
}
