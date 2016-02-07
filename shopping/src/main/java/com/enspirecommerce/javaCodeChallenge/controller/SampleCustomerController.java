package com.enspirecommerce.javaCodeChallenge.controller;

import com.enspirecommerce.javaCodeChallenge.model.Customer;
import com.enspirecommerce.javaCodeChallenge.service.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by mingardia on 2/7/16.
 */
@Component
@Path("sampleCustomer")
public class SampleCustomerController {

    @Autowired
    CustomerDAO customerDAO;

    @Path("/example")
    @GET
    @Produces(value = MediaType.APPLICATION_JSON + "," + MediaType.APPLICATION_XML)
    public Response getSampleCustomer()
    {
        Customer c = customerDAO.getSampleCustomer();

        Response rc = Response.ok(c).build();

        return rc;

    }
}

