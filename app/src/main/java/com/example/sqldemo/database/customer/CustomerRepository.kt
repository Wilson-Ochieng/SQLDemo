package com.example.sqldemo.database.customer

import androidx.lifecycle.LiveData

class CustomerRepository(private val customerDao: CustomerDao){
    val readAllData: LiveData<List<Customer_data>> = customerDao.readAllData()
    suspend fun addCustomer(customer_data: Customer_data){
        customerDao.addCustomer(customer_data)

    }

    infix fun addCustomer_data(customerData: Customer_data) {
        TODO("Not yet implemented")
    }


}

