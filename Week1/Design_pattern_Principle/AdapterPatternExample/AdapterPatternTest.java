public class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor gPay = new GooglePayAdapter(new GooglePayGateway());
        PaymentProcessor phonePay = new PhonePayAdapter(new PhonePayGateway());

        gPay.processPayment(5000);
        phonePay.processPayment(2500);
    }   
}
