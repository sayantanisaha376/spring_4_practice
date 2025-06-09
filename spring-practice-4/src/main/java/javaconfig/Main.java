package javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext  context= new AnnotationConfigApplicationContext(App_Config.class);

        PaymentProvider_Config pc= (PaymentProvider_Config) context.getBean("createPayment_service_byGooglePay");
        pc.startPayment();

        pc=(PaymentProvider_Config) context.getBean("createPayment_service_byPhonePay");
        pc.startPayment();
    }
}
