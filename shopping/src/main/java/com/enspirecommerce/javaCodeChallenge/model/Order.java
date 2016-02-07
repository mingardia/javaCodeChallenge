package com.enspirecommerce.javaCodeChallenge.model;

import java.util.List;

/**
 * Created by mingardia on 2/7/16.
 */
public class Order {

    /**
     * id of this order
     */
    String id;

    /**
     * The order number
     */
    String orderNumber;

    /**
     * The list of products
     */
    List<Product> products;

    /**
     * The set of payments against this order
     */
    List<Payment> payments;

    /**
     * Current state of the order
     */
    OrderState state;


    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getOrderNumber() {

        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {

        this.orderNumber = orderNumber;
    }

    public List<Product> getProducts() {

        return products;
    }

    public void setProducts(List<Product> products) {

        this.products = products;
    }

    public List<Payment> getPayments() {

        return payments;
    }

    public void setPayments(List<Payment> payments) {

        this.payments = payments;
    }

    public OrderState getState() {

        return state;
    }

    public void setState(OrderState state) {

        this.state = state;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (orderNumber != null ? !orderNumber.equals(order.orderNumber) : order.orderNumber != null) return false;
        if (products != null ? !products.equals(order.products) : order.products != null) return false;
        if (payments != null ? !payments.equals(order.payments) : order.payments != null) return false;
        return state == order.state;

    }

    @Override
    public int hashCode() {

        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orderNumber != null ? orderNumber.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        result = 31 * result + (payments != null ? payments.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return "Order{" +
                "id='" + id + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", products=" + products +
                ", payments=" + payments +
                ", state=" + state +
                '}';
    }
}
