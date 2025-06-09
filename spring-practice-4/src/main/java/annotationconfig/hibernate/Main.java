package annotationconfig.hibernate;

import annotationconfig.Application_Annotation_Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application_Annotation_Config.class);
        PaymentService service = context.getBean("paymentService", PaymentService.class);

        service.completePayment("Sayantani", 5000.0);
        service.completePayment("Souparno", 7500.0);
        service.completePayment("Tamojeet", 6500.0);
        service.completePayment("Aditya", 3500.0);
        service.completePayment("Ahana", 500.0);

    }
}
