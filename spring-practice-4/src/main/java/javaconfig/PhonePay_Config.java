package javaconfig;

import loosecoupling.PaymentGateway;

public class PhonePay_Config implements PaymentGateway_Config {
    @Override
    public void payment(){
        System.out.println("Phone Pay Payment");
    };

    @Override
    public void festivalOffer(){
        System.out.println("Phone Pay Festival with 7% cashback");
    };
}
