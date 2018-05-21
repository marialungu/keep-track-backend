package com.keeptrack.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class NoteItemDto {
    private Boolean isNote;
    private Boolean checked;
    private String text;
}
