package com.keeptrack.dto;

import com.keeptrack.entity.NoteItem;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class NoteItemTransformer {
    public NoteItemDto transform(NoteItem noteItem){
        return NoteItemDto.builder()
                .itemId(noteItem.getItemId())
                .isNote(noteItem.getIsNote())
                .checked(noteItem.getChecked())
                .text(noteItem.getText())
                .build();
    }

    public List<NoteItemDto> listTransform(List<NoteItem> items){
        return items.stream().map(this::transform).collect(Collectors.toList());
    }
}
