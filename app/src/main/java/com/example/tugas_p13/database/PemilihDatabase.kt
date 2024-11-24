package com.example.tugas_p13.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Pemilih::class], version = 1)
abstract class PemilihDatabase : RoomDatabase {
    abstract fun DAO(): DAO

    companion object{
        @Volatile
        private var INSTANCE: PemilihDatabase? = null

        fun getInstance(context: Context): PemilihDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PemilihDatabase::class.java,
                    "data_peserta"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                instance
            }
        }
    }
}