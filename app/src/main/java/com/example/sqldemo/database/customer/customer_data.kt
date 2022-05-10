package com.example.sqldemo.database.customer

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Suppress("ClassName")
@Entity(tableName = "customer_data")
data class customer_data(

    @PrimaryKey val ID:Int,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "activity")
    val activity: String,

    @ColumnInfo(name = "age")
    var age: Int )
