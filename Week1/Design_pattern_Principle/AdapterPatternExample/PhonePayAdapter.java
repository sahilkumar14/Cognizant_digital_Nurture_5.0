public class PhonePayAdapter implements PaymentProcessor{
    private PhonePayGateway phonepayGateway;

    public PhonePayAdapter(PhonePayGateway phonePayGateway){
        this.phonepayGateway = phonePayGateway;
    }

    @Override
    public void processPayment(double amount){
        phonepayGateway.makeCharge(amount);
    }
}
