package com.example.tugas_p13.database

import android.app.Application
import androidx.lifecycle.LiveData

class PemilihRepository (application: Application) {
    private val pemilihDao: DAO
    private val allPemilih: LiveData<List<Pemilih>>

    init {
        val database = PemilihDatabase.getInstance(application)
        pemilihDao = database.DAO()
        allPemilih = pemilihDao.getAllPemilih()
    }

    suspend fun insert(pemilih: Pemilih) {
        pemilihDao.insert(pemilih)
    }

    suspend fun update(pemilih: Pemilih) {
        pemilihDao.update(pemilih)
    }

    suspend fun delete(pemilih: Pemilih) {
        pemilihDao.delete(pemilih)
    }

    suspend fun deleteAll() {
        pemilihDao.deleteAll()
    }

}