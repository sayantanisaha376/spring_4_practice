package annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProvider_Annotation_Config {
    private PaymentGateway_Annotation_Config paymentGateway_Annotation_Config;

    @Autowired
    public PaymentProvider_Annotation_Config(@Qualifier("googlePay_Annotation_Config") PaymentGateway_Annotation_Config paymentGateway_Annotation_Config){
        this.paymentGateway_Annotation_Config = paymentGateway_Annotation_Config;
    }

    public void startPayment(){
        paymentGateway_Annotation_Config.payment();
        paymentGateway_Annotation_Config.festivalOffer();
    }

}
