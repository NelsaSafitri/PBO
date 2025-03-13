public class PaymentPaypal {
    private String PaypalToken;
    private String PaypalId;

    PaymentPaypal(String Token, String Id, String customerId) {
        this.PaypalToken = Token;
        this.PaypalId = Id;
    }

    public void pay(double amount) {
        System.out.println("using paypal API to transfer " + amount + " to the account.");
    }
}
