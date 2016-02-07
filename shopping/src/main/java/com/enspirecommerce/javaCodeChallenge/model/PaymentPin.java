package com.enspirecommerce.javaCodeChallenge.model;

/**
 * Created by mingardia on 2/7/16.
 */
public class PaymentPin {
    /**
     * the id
     */
    String id;

    /**
     * Unique pin from the payment gateway
     */
    String pin;

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getPin() {

        return pin;
    }

    public void setPin(String pin) {

        this.pin = pin;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentPin that = (PaymentPin) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return pin != null ? pin.equals(that.pin) : that.pin == null;

    }

    @Override
    public int hashCode() {

        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (pin != null ? pin.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return "PaymentPin{" +
                "id='" + id + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
