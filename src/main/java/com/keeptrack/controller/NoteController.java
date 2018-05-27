package com.keeptrack.controller;

import com.keeptrack.dto.NoteDto;
import com.keeptrack.dto.NoteItemDto;
import com.keeptrack.entity.Note;
import com.keeptrack.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {
    @Autowired
    NoteService noteService;

    @GetMapping("/notes")
    public List<NoteDto> getNotes(){
        return noteService.getAllNotes();
    }

    @PostMapping("/createNote")
    public void createNote(@RequestBody NoteDto noteDto) {
        noteService.createNote(noteDto);
    }

    @DeleteMapping("/deleteNote")
    public void deleteNote(@RequestBody Long noteId) {
        noteService.deleteNote(noteId);
    }

    @DeleteMapping("/deleteItem")
    public  void deleteItem(@RequestBody Long itemId){
        noteService.deleteItem(itemId);
    }

    @PutMapping("/updateNote")
    public void updateNote(@RequestBody NoteDto noteDto) {
        noteService.updateNote(noteDto);
    }

    @PutMapping("/updateNoteItem")
    public void updateNoteItem(@RequestBody NoteItemDto noteItemDto){
        noteService.updateNoteItem(noteItemDto);
    }
}