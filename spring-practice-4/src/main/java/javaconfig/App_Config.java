package javaconfig;

import org.springframework.context.annotation.Bean;

public class App_Config {

    @Bean
    public PaymentGateway_Config createGooglePayPayment(){
        return new GooglePay_Config();
    }
    @Bean
    public PaymentGateway_Config createPhonePayPayment(){
        return new PhonePay_Config();
    }
    @Bean
    public PaymentGateway_Config createPayPalPayment(){
        return new PayPal_Config();
    }

    @Bean
    public PaymentProvider_Config createPayment_service_byPhonePay(){
        return new PaymentProvider_Config(createPhonePayPayment());//DI
    }
    @Bean
    public PaymentProvider_Config createPayment_service_byGooglePay(){
        return new PaymentProvider_Config(createGooglePayPayment());//DI
    }

}
