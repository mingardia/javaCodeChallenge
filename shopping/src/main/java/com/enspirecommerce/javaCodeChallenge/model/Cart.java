package com.enspirecommerce.javaCodeChallenge.model;

import java.util.Date;
import java.util.List;

/**
 * Created by mingardia on 2/7/16.
 */
public class Cart {
    /**
     * The id of the cart
     */
    String id;

    /**
     * Selected Products
     */
    List<Product> selectedProducts;

    /**
     * Date and time the cart was created
     */
    Date createDate;

    /**
     * The customer this cart is for
     */
    Customer customer;

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public List<Product> getSelectedProducts() {

        return selectedProducts;
    }

    public void setSelectedProducts(List<Product> selectedProducts) {

        this.selectedProducts = selectedProducts;
    }

    public Date getCreateDate() {

        return createDate;
    }

    public void setCreateDate(Date createDate) {

        this.createDate = createDate;
    }

    public Customer getCustomer() {

        return customer;
    }

    public void setCustomer(Customer customer) {

        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cart cart = (Cart) o;

        if (id != null ? !id.equals(cart.id) : cart.id != null) return false;
        if (selectedProducts != null ? !selectedProducts.equals(cart.selectedProducts) : cart.selectedProducts != null)
            return false;
        if (createDate != null ? !createDate.equals(cart.createDate) : cart.createDate != null) return false;
        return customer != null ? customer.equals(cart.customer) : cart.customer == null;

    }

    @Override
    public int hashCode() {

        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (selectedProducts != null ? selectedProducts.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return "Cart{" +
                "id='" + id + '\'' +
                ", selectedProducts=" + selectedProducts +
                ", createDate=" + createDate +
                ", customer=" + customer +
                '}';
    }
}
