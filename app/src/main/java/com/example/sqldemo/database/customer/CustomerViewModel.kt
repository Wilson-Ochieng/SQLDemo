package com.example.sqldemo.database.customer

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class CustomerViewModel (application: Application) :AndroidViewModel(application) {
    private val readAllData: LiveData<List<Customer_data>>
    private  val repository : CustomerRepository
    init {
        val customerDao = Customer_Database.getDatabase(application).CustomerDao()
        repository = CustomerRepository(customerDao)
        readAllData = repository.readAllData
        }
    fun addCustomer(customer_data: Customer_data)  {
        viewModelScope.launch {
            repository addCustomer_data (customer_data
                    )

        }
            }
        }
