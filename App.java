public class App {
    public static void main(String[] args) throws Exception {

        PaymentPaypal payX = new PaymentPaypal("1234567890", "1234567890", "1234567890");

        PaymentPaypal payY = new PaymentPaypal("1234567890", "1234567890", "1234567890");
        
        Payment payZ = new Payment("1234567890");

        payX.pay(10000);
        payY.pay(10000);
        payZ.pay(10000);
    }
}