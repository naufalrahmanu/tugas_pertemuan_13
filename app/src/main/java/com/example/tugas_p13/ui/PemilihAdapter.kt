package com.example.tugas_p13.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas_p13.R
import com.example.tugas_p13.database.Pemilih

// Adapter untuk daftar Pemilih
class PemilihAdapter : RecyclerView.Adapter<PemilihAdapter.PemilihViewHolder>() {

    private var pemilihList = emptyList<Pemilih>() // Data Pemilih

    // ViewHolder: Memetakan elemen tampilan
    class PemilihViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewNama: TextView = itemView.findViewById(R.id.text_view_nama)
        val textViewNik: TextView = itemView.findViewById(R.id.text_view_nik)
        val textViewGender: TextView = itemView.findViewById(R.id.)
    }

    // Memuat layout untuk setiap item RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PemilihViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pemilih, parent, false)
        return PemilihViewHolder(itemView)
    }

    // Menghubungkan data ke elemen tampilan
    override fun onBindViewHolder(holder: PemilihViewHolder, position: Int) {
        val currentPemilih = pemilihList[position]
        holder.textViewNama.text = currentPemilih.nama
        holder.textViewNik.text = currentPemilih.nik
        holder.textViewGender.text = when (currentPemilih.gender) {
            Gender.LAKI_LAKI -> "Laki-Laki"
            Gender.PEREMPUAN -> "Perempuan"
        }
    }

    override fun getItemCount(): Int {
        return pemilihList.size
    }

    // Mengatur data baru untuk ditampilkan di RecyclerView
    fun setPemilihList(pemilih: List<Pemilih>) {
        this.pemilihList = pemilih
        notifyDataSetChanged()
    }
}