package com.keeptrack.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "NOTES")
public class Note {
    @Id
    @Column(name = "n_id")
    @GeneratedValue
    private Long noteId;

    @Column (name = "n_name")
    private String noteName;

    @Column (name = "n_checked")
    private Boolean noteChecked;

    @Column (name = "n_content")
    private String noteContent;

    @Column (name = "n_created_at")
    private Date noteCreatedAt;

    @Column (name = "n_b_id", insertable = false, updatable = false)
    private Long boardId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="n_b_id")
    private Board board;
}
