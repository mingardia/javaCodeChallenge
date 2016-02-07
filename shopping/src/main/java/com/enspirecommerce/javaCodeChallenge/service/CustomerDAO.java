package com.enspirecommerce.javaCodeChallenge.service;

import com.enspirecommerce.javaCodeChallenge.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * Created by mingardia on 2/7/16.
 */
public class CustomerDAO {

    @Autowired
    DatastoreStub dataStore;

    public Customer getSampleCustomer()
    {
        return dataStore.getExampleCustomer();
    }

    public Customer save(Customer customer)
    {
        return dataStore.saveCustomer(customer);
    }


    public Collection<Customer> getList()
    {
        return dataStore.getCustomers();
    }

}
