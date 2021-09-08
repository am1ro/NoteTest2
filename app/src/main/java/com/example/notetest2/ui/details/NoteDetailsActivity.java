package com.example.notetest2.ui.details;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.example.notetest2.R;
import com.example.notetest2.domain.Note;

public class NoteDetailsActivity extends AppCompatActivity {

    public static final String ARG_NOTE = "ARG_NOTE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_note_details);

        FragmentManager fragmentManager = getSupportFragmentManager();

        Note note = getIntent().getParcelableExtra(ARG_NOTE);

        fragmentManager.beginTransaction()
                .replace(R.id.container, NoteDetailsFragment.newInstance(note), null)
                .commit();
    }
}