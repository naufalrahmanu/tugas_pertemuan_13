package com.example.tugas_p13.database

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

interface DAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE))
    suspend fun insert(pemilih: Pemilih)

    @Update
    suspend fun update(pemilih: Pemilih)

    @Delete
    suspend fun delete(pemilih: Pemilih)

    @Query("DELETE FROM data_peserta")
    suspend fun deleteAll()

    @Query("SELECT * from data_peserta ORDER BY nama ASC")
    fun getAllPemilih(): LiveData<List<Pemilih>>


}