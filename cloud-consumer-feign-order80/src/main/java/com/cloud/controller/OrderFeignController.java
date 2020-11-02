package com.cloud.controller;

import com.cloud.feign.PaymentFeignService;
import com.commons.entity.CommonResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        CommonResult paymentById = paymentFeignService.getPaymentById(id);
        return paymentById ;
    }

    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentB() throws InterruptedException {
        String paymentLB = paymentFeignService.getPaymentLB();

        return paymentLB ;
    }
}