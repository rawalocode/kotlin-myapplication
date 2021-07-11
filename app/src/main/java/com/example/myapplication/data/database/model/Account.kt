package com.example.myapplication.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "account")
data class Account(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_account")
    val id : Int,

    @ColumnInfo(name="name_account")
    val name : String,
    @ColumnInfo(name = "norek_account")
    val noRek: String,
    @ColumnInfo(name="saldo_account")
    val saldo : Float
)
