package loosecoupling;

public class GooglePay implements PaymentGateway {
    @Override
    public void payment(){
        System.out.println("Google Pay Payment");
    };

    @Override
    public void festivalOffer(){
        System.out.println("Google Pay Festival with 8% cashback");
    };
}
