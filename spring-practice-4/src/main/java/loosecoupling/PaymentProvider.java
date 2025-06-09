package loosecoupling;

public class PaymentProvider {
    private PaymentGateway paymentGateway;

    public PaymentProvider(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }
    public void startPayment(){
        paymentGateway.payment();
        paymentGateway.festivalOffer();
    }
}
