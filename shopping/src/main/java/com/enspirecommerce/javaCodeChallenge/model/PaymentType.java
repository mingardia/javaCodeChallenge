package com.enspirecommerce.javaCodeChallenge.model;

/**
 * Created by mingardia on 2/7/16.
 */
public enum PaymentType {
    CREDIT_CARD,
    CASH;

    public String value() {
        return name();
    }

    public static PaymentType fromValue(String v)
    {
        return valueOf(v);
    }



}
