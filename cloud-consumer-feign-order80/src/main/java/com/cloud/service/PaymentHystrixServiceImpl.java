package com.cloud.service;

import com.cloud.feign.PaymentFeignService;
import com.commons.entity.CommonResult;
import org.springframework.stereotype.Component;

@Component
public class PaymentHystrixServiceImpl implements PaymentFeignService {


    @Override
    public CommonResult getPaymentById(Long id) {
        return null;
    }

    @Override
    public String getPaymentLB() throws InterruptedException {
        return "程序运行繁忙或报错,请稍后再试*****"+"当前线程: "+Thread.currentThread().getName()+"\t "+"orz!";
    }
}
