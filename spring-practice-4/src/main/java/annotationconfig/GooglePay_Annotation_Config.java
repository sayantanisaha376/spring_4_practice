package annotationconfig;

import javaconfig.PaymentGateway_Config;
import org.springframework.stereotype.Component;

@Component
public class GooglePay_Annotation_Config implements PaymentGateway_Annotation_Config {
    @Override
    public void payment(){
        System.out.println("Google Pay Payment");
    };

    @Override
    public void festivalOffer(){
        System.out.println("Google Pay Festival with 8% cashback");
    };

}
