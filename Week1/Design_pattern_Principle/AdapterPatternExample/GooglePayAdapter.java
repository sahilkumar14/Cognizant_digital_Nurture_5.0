public class GooglePayAdapter implements PaymentProcessor{
    private GooglePayGateway gpayGateway;
    public GooglePayAdapter(GooglePayGateway gpayGateway){
        this.gpayGateway = gpayGateway;
    }

    @Override
    public void processPayment(double amount){
        gpayGateway.sendPayment(amount);
    }
}
