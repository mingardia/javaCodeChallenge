package com.enspirecommerce.javaCodeChallenge.model;

import java.util.List;

/**
 * Created by mingardia on 2/7/16.
 */
public class Customer {
    /**
     * The id
     */
    String id;

    /**
     * The name of the customer
     */
    String name;

    /**
     * A list of orders from the past
     */
    List<Order> orderHistory;

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public List<Order> getOrderHistory() {

        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {

        this.orderHistory = orderHistory;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != null ? !id.equals(customer.id) : customer.id != null) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        return orderHistory != null ? orderHistory.equals(customer.orderHistory) : customer.orderHistory == null;

    }

    @Override
    public int hashCode() {

        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (orderHistory != null ? orderHistory.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", orderHistory=" + orderHistory +
                '}';
    }
}
