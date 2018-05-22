package com.keeptrack.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BOARDS")
public class Board {
    @Id
    @Column(name = "b_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(name = "b_name")
    private String boardName;

    @Column(name = "b_color")
    private String boardColor;

//    @Column(name = "b_created_at")
//    private Date boardCreatedAt;

//    @Column(name = "b_u_id")
//    private Long userId;

    @JsonIgnore
    @OneToMany(mappedBy = "board",cascade ={CascadeType.ALL}, orphanRemoval = true)
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

//    public Long getUserId() {
//        return userId;
//    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public void setBoardColor(String boardColor) {
        this.boardColor = boardColor;
    }

//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
}
