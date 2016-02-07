package com.enspirecommerce.javaCodeChallenge.model;

/**
 * Created by mingardia on 2/7/16.
 */
public enum OrderState {
    OPEN,
    CLOSED,
    CANCELED;


    public String value() {
        return name();
    }

    public static OrderState fromValue(String v)
    {
        return valueOf(v);
    }
}
