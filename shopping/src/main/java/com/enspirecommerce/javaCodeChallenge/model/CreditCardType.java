package com.enspirecommerce.javaCodeChallenge.model;

/**
 * Created by mingardia on 2/7/16.
 */
public enum CreditCardType {
    VISA,
    MASTER_CARD,
    AMERICAN_EXPRESS,
    DISCOVER;

    public String value() {
        return name();
    }

    public static CreditCardType fromValue(String v)
    {
        return valueOf(v);
    }
}
