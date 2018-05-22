package com.keeptrack.service;

import com.keeptrack.dto.NoteDto;
import com.keeptrack.dto.NoteDtoTransformer;
import com.keeptrack.entity.Note;
import com.keeptrack.entity.NoteItem;
import com.keeptrack.repository.NoteItemRepository;
import com.keeptrack.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoteService {

    @Autowired
    NoteRepository noteRepository;

    @Autowired
    NoteDtoTransformer noteDtoTransformer;

    @Autowired
    NoteItemRepository noteItemRepository;

    public List<NoteDto> getAllNotes() {

        List<NoteDto> noteDtoList = new ArrayList<>();
        List<Note> noteList = noteRepository.findAll();

        NoteDto noteDto;

        for (Note note : noteList) {
            List<NoteItem> noteItemList = noteItemRepository.findItemsByNoteId(note.getNoteId());
            noteDto = noteDtoTransformer.transform(note, noteItemList);
            noteDtoList.add(noteDto);
        }
        return noteDtoList;
    }

    public void deleteNote(Long noteId) {
        noteRepository.deleteById(noteId);
    }

    public void deleteItem(Long itemId) {
        noteItemRepository.deleteById(itemId);
    }
}

