package com.keeptrack.controller;

import com.keeptrack.dto.NoteDto;
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

    @DeleteMapping("/deleteNote")
    public void deleteNote(@RequestBody Long noteId) {
        noteService.deleteNote(noteId);
    }

    @DeleteMapping("/deleteItem")
    public  void deleteItem(@RequestBody Long itemId){
        noteService.deleteItem(itemId);
    }
}