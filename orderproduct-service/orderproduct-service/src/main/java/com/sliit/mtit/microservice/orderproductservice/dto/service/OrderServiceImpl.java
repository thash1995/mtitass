package com.sliit.mtit.microservice.orderproductservice.dto.service;


import com.sliit.mtit.microservice.orderproductservice.dto.OrderRequest;
import com.sliit.mtit.microservice.orderproductservice.dto.OrderResponse;
import com.sliit.mtit.microservice.orderproductservice.dto.PaymentCreationRequest;
import com.sliit.mtit.microservice.orderproductservice.dto.PaymentCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Response;
import java.util.UUID;

@Service
public class OrderServiceImpl{
    @Autowired
    private RestTemplate restTemplate;

    public OrderResponse createOrder(OrderRequest orderRequest){
        PaymentCreationRequest paymentCreationRequest = new PaymentCreationRequest();
        paymentCreationRequest.setName(orderRequest.getName());

        ResponseEntity<PaymentCreationResponse>paymentCreationResponse =restTemplate.postForEntity("http://localhost:8080/payment",paymentCreationRequest, PaymentCreationResponse.class);


        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setPaymentId(paymentCreationResponse.getBody().getPaymentId());
        orderResponse.setFeedback("Successfully placed the order");
        return orderResponse;
    }

@Bean
    public  RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
}

}