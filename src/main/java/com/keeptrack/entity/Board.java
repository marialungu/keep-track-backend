package com.keeptrack.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @OneToMany(mappedBy = "board")
    private List<Note> notes;

    public Long getBoardId() {
        return boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public String getBoardColor() {
        return boardColor;
    }

    public Date getBoardCreatedAt() {
        return boardCreatedAt;
    }

    public String getUserId() {
        return userId;
    }
}
