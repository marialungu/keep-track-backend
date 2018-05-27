package com.keeptrack.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ITEMS")
public class NoteItem {

    @Id
    @Column(name = "i_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @Column (name = "i_isnote")
    private Long isNote;

    @Column (name = "i_checked")
    private String checked;

    @Column (name = "i_text")
    private String text;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "n_id")
    private Note note;

    public Long getItemId() {
        return itemId;
    }

    public Long getIsNote() {
        return isNote;
    }

    public String getChecked() {
        return checked;
    }

    public String getText() {
        return text;
    }

    public Note getNote() {
        return note;
    }

    public void setIsNote(Long isNote) {
        this.isNote = isNote;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}
