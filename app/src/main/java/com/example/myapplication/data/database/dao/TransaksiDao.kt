package com.example.myapplication.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myapplication.data.database.model.Transaksi

@Dao
interface TransaksiDao {

    @Insert
    suspend fun insert(transaksi : Transaksi) : Long

    @Update
    suspend fun update(transaksi : Transaksi) : Int

    @Delete
    suspend fun delete(transaksi : Transaksi) : Int

    @Query("SELECT * FROM transaksi")
    fun getAll() : LiveData<List<Transaksi>>

    @Query("DELETE FROM transaksi")
    fun deleteAll() : Int
}