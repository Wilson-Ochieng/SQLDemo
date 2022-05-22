package com.example.sqldemo.database.customer

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CustomerDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
     suspend fun addCustomer(customer:Customer_data)
     @Query(  "SELECT*FROM Customer_info ORDER BY ID ASC")
     fun readAllData(): LiveData<List<Customer_data>>

}