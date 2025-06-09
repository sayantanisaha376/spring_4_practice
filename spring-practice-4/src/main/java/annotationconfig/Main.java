package annotationconfig;

import annotationconfig.hibernate.PaymentService;
import javaconfig.PayPal_Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Application_Annotation_Config.class);
        PaymentProvider_Annotation_Config pt=(PaymentProvider_Annotation_Config) context.getBean("paymentProvider_Annotation_Config");

        pt.startPayment();



    }
}
