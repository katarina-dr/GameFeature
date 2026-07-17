package com.games.gamefeature.service;

import com.games.gamefeature.entity.Note;
import com.games.gamefeature.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }

    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    public Note updateNote(Long id, Note updatedNote) {
        Note note = noteRepository.findById(id).orElse(null);

        if (note == null) {
            return null;
        }

        note.setContent(updatedNote.getContent());
        note.setAuthor(updatedNote.getAuthor());
        note.setGame(updatedNote.getGame());

        return noteRepository.save(note);
    }

    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }

}