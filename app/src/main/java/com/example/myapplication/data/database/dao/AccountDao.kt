package com.example.myapplication.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myapplication.data.database.model.Account

@Dao
interface AccountDao {
    @Insert
    suspend fun insert(account : Account) : Long

    @Update
    suspend fun update(account: Account) : Int

    @Delete
    suspend fun delete(account: Account) : Int

    @Query("SELECT * FROM account")
    fun getAll():LiveData<List<Account>>

    @Query("DELETE FROM account")
    fun deleteAll() : Int
}