package com.enspirecommerce.javaCodeChallenge.service;

import com.enspirecommerce.javaCodeChallenge.model.Cart;
import com.enspirecommerce.javaCodeChallenge.model.Customer;
import com.enspirecommerce.javaCodeChallenge.model.Order;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * Created by mingardia on 2/7/16.
 */
public class DatastoreStub {

    protected HashMap<String, Customer> customers;

    protected HashMap<String, Order> orders;

    protected HashMap<String, Cart> carts;


    // Customer
    public Collection<Customer> getCustomers()
    {
        return customers.values();
    }

    public Customer saveCustomer(Customer customer)
    {
        return customers.put(customer.getId(), customer);
    }

    public Customer getCustomer(String id)
    {
        return customers.get(id);
    }

    public Customer getExampleCustomer() {

        Customer rc = new Customer();
        rc.setId("11111");
        rc.setName("Sample Name");

        return rc;
    }


    // Orders
    public Collection<Order> getOrders()
    {
        return orders.values();
    }

    public Order getOrder(String id)
    {
        return orders.get(id);
    }

    public Order saveOrder(Order order)
    {
        return orders.put(order.getId(), order);
    }


    // Cart
    public Collection<Cart> getCarts()
    {
        return carts.values();
    }

    public Cart getCart(String id)
    {
        return carts.get(id);
    }

    public Cart saveCart(Cart cart)
    {
        return carts.put(cart.getId(), cart);
    }


}
