package com.example.sqldemo.database.customer
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.sqldemo.CustomerModel

interface CustomerDatabaseDao {
        @Insert
        fun insert(customerModel: customer_data)

        @Update
        fun update(customerModel: customer_data)

        @Query("SELECT * from customer_data WHERE iD = :key")
        fun get(key: Int): customer_data?

        @Query("DELETE FROM customer_data")
        fun clear()

        @Query("SELECT * FROM customer_data ORDER BY iD DESC LIMIT 1")
        fun getTonight(): customer_data?

        @Query("SELECT * FROM customer_data ORDER BY iD DESC")
        fun getAllNights(): LiveData<List<customer_data>>
    }
