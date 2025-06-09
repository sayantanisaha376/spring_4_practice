package annotationconfig;

import javaconfig.PaymentGateway_Config;
import org.springframework.stereotype.Component;

@Component
public class PayPal_Annotation_Config implements PaymentGateway_Annotation_Config {
    @Override
    public void payment(){
        System.out.println("PayPal Payment");
    };

    @Override
    public void festivalOffer(){
        System.out.println("PayPal Festival with 1% cashback");
    };
}
