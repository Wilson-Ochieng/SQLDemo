package com.example.sqldemo.database.customer

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "Customer_Info")
data class Customer_data(
@PrimaryKey(autoGenerate = true)
     val ID:Int,
     val cname: String,
     val activity: String,
)
