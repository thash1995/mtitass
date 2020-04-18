package com.sliit.mtit.microservice.orderproductservice.Controller;

import com.sliit.mtit.microservice.orderproductservice.dto.OrderRequest;
import com.sliit.mtit.microservice.orderproductservice.dto.OrderResponse;
import com.sliit.mtit.microservice.orderproductservice.dto.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

@Autowired
   private OrderServiceImpl orderService;

    //public OrderController(OrderServiceImpl orderService) {
       // this.orderService = orderService;
   // }

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody OrderResponse createOrder(@RequestBody OrderRequest orderRequest){

        System.out.println("Order Details :" +orderRequest);



        return orderService.createOrder(orderRequest);
    }
}
