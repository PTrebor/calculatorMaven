package com.endava.jackson;

import com.endava.google.Payment;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JacksonExample {
    private static final Logger LOGGER = LogManager.getLogger(JacksonExample.class);

    public static void main(String[] args) throws JsonProcessingException {
        Payment p = new Payment();
        p.setAmount(120.3);
        p.setCurrency("RON");
        p.setCardNumber("9321737127343276");
        p.setCustomerName("George Florin");

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(p);
        LOGGER.info(json);

        Payment dP = objectMapper.readValue(json, Payment.class);
        LOGGER.info(dP.equals(p));

    }

}