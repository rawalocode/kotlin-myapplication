package com.example.myapplication.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "transaksi")
data class Transaksi(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_transaksi")
    val id : Int,
    @ColumnInfo(name = "desc_transaksi")
    val desc : String,
    @ColumnInfo(name = "date_transaksi")
    val date: Date,
    @ColumnInfo(name = "amount_in")
    val amountIn : Float,
    @ColumnInfo(name = "amount_out")
    val amountOut : Float,
    @ColumnInfo(name = "total")
    val total : Float
)
