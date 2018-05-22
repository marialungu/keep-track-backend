package com.keeptrack.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "NOTES")
public class Note {
    @Id
    @Column(name = "n_id")
    @GeneratedValue
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
    private Set<NoteItem> items;

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
}
