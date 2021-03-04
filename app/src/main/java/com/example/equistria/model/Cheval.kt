package com.example.equistria.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.util.*

@Entity
data class Cheval(
    @PrimaryKey(autoGenerate = true) val uid: Int? = null,
    val nom: String,
    val affixe: String?,
    val race: String,
    val robe: String,
    val dateNaissance: LocalDate,
    val dateDeces : LocalDate?,
    val taille: Number,
    val poids: Number,
    val sexe: String,
    val sterile: Boolean,
    val reproducteur: Boolean,

)