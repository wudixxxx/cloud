package com.cloud.feign;

import com.cloud.service.PaymentHystrixServiceImpl;
import com.commons.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cloud-payment-service",fallback = PaymentHystrixServiceImpl.class)//调用的服务名
@Component
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value="/payment/lb")
    public String getPaymentLB() throws InterruptedException;
}
