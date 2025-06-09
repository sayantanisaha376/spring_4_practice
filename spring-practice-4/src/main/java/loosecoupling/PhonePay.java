package loosecoupling;

public class PhonePay implements PaymentGateway {
    @Override
    public void payment(){
        System.out.println("Phone Pay Payment");
    };

    @Override
    public void festivalOffer(){
        System.out.println("Phone Pay Festival with 7% cashback");
    };
}
