package com.enspirecommerce.javaCodeChallenge;

import com.enspirecommerce.javaCodeChallenge.service.CheckoutService;
import com.enspirecommerce.javaCodeChallenge.service.CustomerDAO;
import com.enspirecommerce.javaCodeChallenge.service.DatastoreStub;
import com.enspirecommerce.javaCodeChallenge.service.PaymentGatewayService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by mingardia on 2/7/16.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class JavaChallengeApp1 {
    @Autowired
    private ApplicationContext ctx;


    private static final Log logger = LogFactory.getLog(JavaChallengeApp1.class);


    public static void main(String[] args) {

        SpringApplication.run(JavaChallengeApp1.class, args);
    }

    @Bean
    CheckoutService checkoutService()
    {
        return new CheckoutService();
    }

    @Bean
    PaymentGatewayService paymentGatewayService()
    {
        return new PaymentGatewayService();
    }

    @Bean
    CustomerDAO customerDAO()
    {
        return new CustomerDAO();
    }

    @Bean
    DatastoreStub datastoreStub()
    {
        return new DatastoreStub();
    }



}
