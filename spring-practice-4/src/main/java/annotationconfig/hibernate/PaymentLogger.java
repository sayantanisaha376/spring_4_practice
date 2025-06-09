package annotationconfig.hibernate;
@FunctionalInterface

public interface PaymentLogger {
    void store(String customerName,Double amount);
}
