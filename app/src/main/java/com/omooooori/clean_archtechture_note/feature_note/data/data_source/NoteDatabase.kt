package com.omooooori.clean_archtechture_note.feature_note.data.data_source

import androidx.room.Database
import com.omooooori.clean_archtechture_note.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)

abstract class NoteDatabase {

    abstract val noteDao: NoteDao

}