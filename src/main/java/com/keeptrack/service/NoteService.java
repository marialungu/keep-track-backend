package com.keeptrack.service;

import com.keeptrack.dto.NoteDto;
import com.keeptrack.dto.NoteDtoTransformer;
import com.keeptrack.dto.NoteItemDto;
import com.keeptrack.entity.Board;
import com.keeptrack.entity.Note;
import com.keeptrack.entity.NoteItem;
import com.keeptrack.repository.BoardRepository;
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

    @Autowired
    BoardRepository boardRepository;

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

    public void createNote(NoteDto noteDto) {
        Board board = boardRepository.getOne(noteDto.getBoardId());

        Note note = new Note();
        noteSetter(noteDto, note, board);
        noteRepository.save(note);

        List<NoteItem> noteItems = new ArrayList<>();
        for (NoteItemDto itemDto : noteDto.getNoteContent()){
            appendNoteItem(noteItems, itemDto, note);
        }
        noteItemRepository.saveAll(noteItems);
    }

    public void updateNote(NoteDto noteDto) {

        Note note = noteRepository.getOne(noteDto.getNoteId());
        noteSetter(noteDto, note, null);
        noteRepository.save(note);

        if (null != noteDto.getNoteContent() && noteDto.getNoteContent().size() > 0) {

            for (NoteItemDto itemDto : noteDto.getNoteContent()) {
                updateNoteItem(itemDto);
            }
        }
    }

    public void updateNoteItem(NoteItemDto noteItemDto){
        NoteItem item = noteItemRepository.getOne(noteItemDto.getItemId());
        setNoteItemFields(noteItemDto, item);
        noteItemRepository.save(item);
    }

    private void noteSetter(NoteDto noteDto, Note note, Board board) {
        note.setNoteName(noteDto.getNoteName());
        if (null != board)
            note.setBoard(board);
        note.setNoteCreatedAt(noteDto.getNoteCreatedAt());
    }

    private void appendNoteItem(List<NoteItem> noteItems, NoteItemDto itemDto, Note note) {
        NoteItem item = new NoteItem();
        setNoteItemFields(itemDto, item);
        item.setNote(note);
        noteItems.add(item);
    }

    private void setNoteItemFields(NoteItemDto itemDto, NoteItem item) {
        item.setIsNote(itemDto.getIsNote());
        item.setChecked(itemDto.getChecked());
        item.setText(itemDto.getText());
    }
}

