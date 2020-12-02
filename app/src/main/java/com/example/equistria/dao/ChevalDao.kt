package com.example.equistria.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.equistria.model.Cheval

@Dao
interface ChevalDao {
    @Query("SELECT * FROM cheval")
    suspend fun getAll(): List<Cheval>

    @Query("SELECT * FROM cheval WHERE uid IN (:chevalIds)")
    suspend fun loadAllByIds(chevalIds: IntArray): List<Cheval>

    @Query("SELECT * FROM cheval WHERE nom LIKE :nom LIMIT 1")
    suspend fun findByName(nom: String): Cheval

    @Insert
    suspend fun insertAll(vararg chevaux: Cheval)

    @Delete
    suspend fun delete(cheval: Cheval)
}