package com.example.myapplication.data.database.repository

import com.example.myapplication.data.database.dao.TransaksiDao
import com.example.myapplication.data.database.model.Transaksi

class TransaksiRepository(private val dao : TransaksiDao) {
    val transaksi = dao.getAll()

    suspend fun insert(transaksi: Transaksi) : Long{
        return dao.insert(transaksi)
    }

    suspend fun update(transaksi: Transaksi) : Int{
        return dao.update(transaksi)
    }

    suspend fun delete(transaksi: Transaksi) : Int{
        return dao.delete(transaksi)
    }

    suspend fun deleteAll() : Int{
        return dao.deleteAll()
    }
}