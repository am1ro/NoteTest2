package com.example.notetest2.ui.List;

import com.example.notetest2.domain.Note;
import com.example.notetest2.domain.NoteRepository;

import java.util.List;

public class NotesListPresenter {

    private final NotesListView view;
    private final NoteRepository repository;


    public NotesListPresenter(NotesListView view, NoteRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    public void requestNotes() {
        List<Note> result = repository.getNotes();

        view.showNotes(result);
    }
}
