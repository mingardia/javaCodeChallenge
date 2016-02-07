package com.enspirecommerce.javaCodeChallenge.model;

/**
 * Created by mingardia on 2/7/16.
 */
public class Payment {
    /**
     * the id
     */
    String id;

    /**
     * Unique orderNumber
     */
    String orderNumber;

    /**
     * payment Type
     */
    PaymentType paymentType;


    /**
     * The amount of this payment
     */
    float amount;

    /**
     * The pin ref from the payment gateway
     */
    PaymentPin pinRef;

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

    public PaymentType getPaymentType() {

        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {

        this.paymentType = paymentType;
    }

    public float getAmount() {

        return amount;
    }

    public void setAmount(float amount) {

        this.amount = amount;
    }

    public PaymentPin getPinRef() {

        return pinRef;
    }

    public void setPinRef(PaymentPin pinRef) {

        this.pinRef = pinRef;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (Float.compare(payment.amount, amount) != 0) return false;
        if (id != null ? !id.equals(payment.id) : payment.id != null) return false;
        if (orderNumber != null ? !orderNumber.equals(payment.orderNumber) : payment.orderNumber != null) return false;
        if (paymentType != payment.paymentType) return false;
        return pinRef != null ? pinRef.equals(payment.pinRef) : payment.pinRef == null;

    }

    @Override
    public int hashCode() {

        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orderNumber != null ? orderNumber.hashCode() : 0);
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (amount != +0.0f ? Float.floatToIntBits(amount) : 0);
        result = 31 * result + (pinRef != null ? pinRef.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return "Payment{" +
                "id='" + id + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", paymentType=" + paymentType +
                ", amount=" + amount +
                ", pinRef=" + pinRef +
                '}';
    }
}
