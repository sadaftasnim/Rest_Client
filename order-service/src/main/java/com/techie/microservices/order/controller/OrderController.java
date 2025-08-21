package com.techie.microservices.order.controller;

import com.techie.microservices.order.dto.OrderRequest;
import com.techie.microservices.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor

public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        String result = orderService.placeOrder(orderRequest);
        if(result == "") {
            return "Order Placed Successfully";
        }
        else{
            //return "Product with SkuCode \" + result + \" is not in stock";
            return "Product with SkuCode " + result + " is not in stock";

        }
    }

}
