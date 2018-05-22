package com.keeptrack.repository;

import com.keeptrack.entity.NoteItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteItemRepository extends JpaRepository<NoteItem, Long>{

    @Query("select n from NoteItem n" +
            " where n.note.id = ?1 ")
    List<NoteItem> findItemsByNoteId(Long noteId);
}
