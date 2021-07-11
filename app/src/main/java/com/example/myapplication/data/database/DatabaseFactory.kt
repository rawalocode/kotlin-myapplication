package com.example.myapplication.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.data.database.dao.AccountDao
import com.example.myapplication.data.database.dao.TransaksiDao
import com.example.myapplication.data.database.model.Account
import com.example.myapplication.data.database.model.Transaksi

@Database(entities = [Account::class, Transaksi::class], version = 1)
abstract class DatabaseFactory : RoomDatabase() {
    abstract val accountDao : AccountDao
    abstract val transaksiDao : TransaksiDao

    companion object{
        @Volatile
        private var INSTANCE : DatabaseFactory? = null
        fun getInstance(context : Context) : DatabaseFactory{
            var instance = INSTANCE
            if(instance == null){
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    DatabaseFactory::class.java,
                    "myapplication_database"
                ).build()
            }
            return instance
        }
    }
}