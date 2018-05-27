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

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/notes")
    public List<NoteDto> getNotes(){
        return noteService.getAllNotes();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/createNote")
    public void createNote(@RequestBody NoteDto noteDto) {
        noteService.createNote(noteDto);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/deleteNote")
    public void deleteNote(@RequestBody Long noteId) {
        noteService.deleteNote(noteId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/deleteItem")
    public  void deleteItem(@RequestBody Long itemId){
        noteService.deleteItem(itemId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/updateNote")
    public void updateNote(@RequestBody NoteDto noteDto) {
        noteService.updateNote(noteDto);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/updateNoteItem")
    public void updateNoteItem(@RequestBody NoteItemDto noteItemDto){
        noteService.updateNoteItem(noteItemDto);
    }
}