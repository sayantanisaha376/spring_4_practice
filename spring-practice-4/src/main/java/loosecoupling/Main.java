package loosecoupling;

public class Main {
    public static void main(String[] args) {

        PaymentGateway paymentGateway= new GooglePay();
        PaymentProvider paymentProvider=new PaymentProvider(paymentGateway);
        paymentProvider.startPayment();

        paymentGateway=new PhonePay();
        paymentProvider=new PaymentProvider(paymentGateway);
        paymentProvider.startPayment();







    }
}
