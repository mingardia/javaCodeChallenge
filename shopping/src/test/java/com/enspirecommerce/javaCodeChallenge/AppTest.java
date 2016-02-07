package com.enspirecommerce.javaCodeChallenge;

;import com.enspirecommerce.javaCodeChallenge.model.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    private static final Logger LOG = LoggerFactory.getLogger(AppTest.class);

    /**
     * Example technologies
     */
    @Test
    public void showExamples() throws JsonProcessingException {
        if (LOG.isDebugEnabled())
        {
            LOG.debug("Show how jackson can convert something to json");
        }

        Customer customer = new Customer();

        customer.setName("TestName");
        customer.setId("12312321");

        ObjectMapper mapper = new ObjectMapper();

        String jsonValue = mapper.writeValueAsString(customer);

        if (LOG.isInfoEnabled())
        {
            LOG.info("Json Value:" + jsonValue);
        }

    }
}
