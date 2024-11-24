package com.example.tugas_p13.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope

import kotlinx.coroutines.launch

class PemilihViewModel (application: Application) : AndroidViewModel(application) {

    private val repository: PemilihRepository = PemilihRepository(application)

    val allPemilih: LiveData<List<Pemilih>> = repository.allPemilih

    fun insert(pemilih: Pemilih) = viewModelScope.launch {
        repository.insert(pemilih)
    }

    fun update(pemilih: Pemilih) = viewModelScope.launch {
        repository.update(pemilih)
    }

    fun delete(pemilih: Pemilih) = viewModelScope.launch {
        repository.delete(pemilih)
    }

    fun deleteAll() = viewModelScope.launch {
        repository.deleteAll()
    }

}