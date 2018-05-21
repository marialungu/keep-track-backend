package com.keeptrack.service;

import com.keeptrack.dto.NoteDto;
import com.keeptrack.dto.NoteDtoTransformer;
import com.keeptrack.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoteService {

    @Autowired
    NoteRepository noteRepository;

    @Autowired
    NoteDtoTransformer noteDtoTransformer;

    public List<NoteDto> getAllNotes(){
        return noteRepository.findAll().stream()
                .map( board -> noteDtoTransformer.transform(board))
                .collect(Collectors.toList());
    }
}
