package annotationconfig.hibernate;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component("paymentService")
public class PaymentService implements PaymentLogger{
    @Override
    public void store(String customerName,Double amount){
        System.out.println("storing paymentdetails");
    }

    private PaymentDAO paymentDAO;

    public PaymentService(PaymentDAO paymentDAO) {
        this.paymentDAO = paymentDAO;
    }

    @Transactional
    public void completePayment(String customerName, Double amount) {
        PaymentLogger logger = (n, amt) -> paymentDAO.save(n, amt);
        logger.store(customerName, amount);
    }
}
