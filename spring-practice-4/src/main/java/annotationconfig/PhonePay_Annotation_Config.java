package annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class PhonePay_Annotation_Config implements PaymentGateway_Annotation_Config {
    @Override
    public void payment(){
        System.out.println("Phone Pay Payment");
    };

    @Override
    public void festivalOffer(){
        System.out.println("Phone Pay Festival with 7% cashback");
    };
}
