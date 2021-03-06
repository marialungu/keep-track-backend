package com.keeptrack.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "NOTES")
public class Note {
    @Id
    @Column(name = "n_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noteId;

    @Column (name = "n_name")
    private String noteName;

    @Column (name = "n_created_at")
    private Date noteCreatedAt;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "b_id")
    private Board board;

    @JsonIgnore
    @OneToMany(mappedBy = "note", cascade ={CascadeType.ALL}, orphanRemoval = true)
    private List<NoteItem> items;

    public Board getBoard() {
        return board;
    }

    public Long getNoteId() {
        return noteId;
    }

    public String getNoteName() {
        return noteName;
    }

    public Date getNoteCreatedAt() {
        return noteCreatedAt;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public void setNoteCreatedAt(Date noteCreatedAt) {
        this.noteCreatedAt = noteCreatedAt;
    }

    public void setItems(List<NoteItem> items) {
        this.items = items;
    }

    public List<NoteItem> getItems() {
        return items;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
