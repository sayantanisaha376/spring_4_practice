package javaconfig;

public class PayPal_Config implements PaymentGateway_Config{
    @Override
    public void payment(){
        System.out.println("PayPal Payment");
    };

    @Override
    public void festivalOffer(){
        System.out.println("PayPal Festival with 1% cashback");
    };
}
