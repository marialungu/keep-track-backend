package com.keeptrack.dto;

import lombok.Builder;

@Builder
public class NoteItemDto {
    private Long itemId;
    private Long isNote;
    private String checked;
    private String text;

    public Long getItemId() {
        return itemId;
    }

    public Long getIsNote() {
        return isNote;
    }

    public void setIsNote(Long isNote) {
        this.isNote = isNote;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
