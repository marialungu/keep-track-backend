package com.keeptrack.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class NoteItemDto {
    private Long itemId;
    private Long isNote;
    private String checked;
    private String text;
}
