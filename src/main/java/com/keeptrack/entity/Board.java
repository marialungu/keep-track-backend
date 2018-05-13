package com.keeptrack.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "BOARDS")
public class Board {
    @Id
    @Column(name = "b_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long boardId;

    @Column(name = "b_name")
    private String boardName;

    @Column(name = "b_color")
    private String boardColor;

    @Column(name = "b_created_at")
    private Date boardCreatedAt;

    @Column(name = "b_u_id")
    private String userId;

    @OneToMany(mappedBy = "boardId")
    private List<Note> notes;
}
