package com.example.sqldemo.database.customer

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [Customer_data::class],version=1,exportSchema=false)
abstract class Customer_Database:RoomDatabase() {
 abstract fun CustomerDao():CustomerDao

 companion object{
     @Volatile

     private var INSTANCE : Customer_Database?=null
     fun getDatabase(context: Context):Customer_Database{
         val tempInstance= INSTANCE
         if (tempInstance !=null){
                 return tempInstance
             }
             synchronized(this){
                 val instance = Room.databaseBuilder(
                     context.applicationContext,
                     Customer_Database ::class.java,
                     "Customer_Database"
                 ).build()
                 INSTANCE=instance
                 return instance
             }


     }
 }
}