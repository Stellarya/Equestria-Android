package com.example.equistria.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.equistria.dao.ChevalDao

@Database(entities = [Cheval::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun chevalDao(): ChevalDao
}