package com.sliit.mtit.microservice.paymentorderservice.Controller;


import com.sliit.mtit.microservice.paymentorderservice.dto.PaymentRequest;
import com.sliit.mtit.microservice.paymentorderservice.dto.PaymentResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/payment")
public class PaymentController {
@PostMapping(consumes = "application/json", produces = "application/json")
        public @ResponseBody PaymentResponse createPayment(@RequestBody PaymentRequest paymentRequest){

        System.out.println("payment details:" + paymentRequest);

        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setPaymentId(UUID.randomUUID().toString());
        paymentResponse.setFeedback("Successfully placed the payment");
        return paymentResponse;
        }

}

