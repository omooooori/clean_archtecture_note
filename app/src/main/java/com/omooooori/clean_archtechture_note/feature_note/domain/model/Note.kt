package com.omooooori.clean_archtechture_note.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.omooooori.clean_archtechture_note.ui.theme.RedOrange
import com.omooooori.clean_archtechture_note.ui.theme.LightGreen
import com.omooooori.clean_archtechture_note.ui.theme.Violet
import com.omooooori.clean_archtechture_note.ui.theme.BabyBlue
import com.omooooori.clean_archtechture_note.ui.theme.RedPink

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)