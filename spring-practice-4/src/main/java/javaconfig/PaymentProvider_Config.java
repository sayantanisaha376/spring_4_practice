package javaconfig;

public class PaymentProvider_Config {
    private PaymentGateway_Config pc;

    public PaymentProvider_Config(PaymentGateway_Config pc) {
        this.pc = pc;
    }
    public void startPayment(){
        pc.payment();
    }

}
