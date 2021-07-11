package com.example.myapplication.data.database.repository

import com.example.myapplication.data.database.dao.AccountDao
import com.example.myapplication.data.database.model.Account

class AccountRepository(private val dao: AccountDao) {
    val accounts = dao.getAll()

    suspend fun insert(account: Account) : Long{
        return dao.insert(account)
    }

    suspend fun update(account: Account):Int{
        return dao.update(account)
    }

    suspend fun delete(account: Account) : Int{
        return dao.delete(account)
    }

    suspend fun deleteAll() : Int{
        return dao.deleteAll()
    }

}