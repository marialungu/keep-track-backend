package com.keeptrack.dto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class NoteItemTransformer {
    public List<NoteItemDto> transform(String input){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(input, new TypeReference<List<NoteItemDto>>(){});
        } catch (IOException e) {
            return null;
        }
    }
}
