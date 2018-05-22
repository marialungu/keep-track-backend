package com.keeptrack.controller;

import com.keeptrack.dto.NoteDto;
import com.keeptrack.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    NoteService noteService;

    @GetMapping("/")
    public List<NoteDto> getNotes(){
        return noteService.getAllNotes();
    }

    @DeleteMapping("/delete")
    public void deleteNote(@RequestBody Long noteId) {
        noteService.deleteNote(noteId);
    }



}
