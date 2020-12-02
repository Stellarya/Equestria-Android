package com.example.equistria.repository

import com.example.equistria.dao.ChevalDao

class ChevalRepository(
    private val chevalDao: ChevalDao/*,
    private val chevalApi: ChevalApi*/
) {

    suspend fun getAll() = chevalDao.getAll()
}