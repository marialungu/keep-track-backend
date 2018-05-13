package com.keeptrack.repository;

import com.keeptrack.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findByBoardIdIn(List<Long> id);

    Board findByBoardId(long id);
}
