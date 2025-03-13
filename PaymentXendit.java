public class PaymentXendit {
    private String PaymentMethod;
    private String SecretToken;
    private String projectId;

    public PaymentXendit(String PaymentMethod) {
        //assign method when object created
        this.PaymentMethod = PaymentMethod;
    }

    public void pay(double amount) {
        if (this.PaymentMethod == "transfer") {
            this.bankTransfer();
        }
        else if (this.PaymentMethod == "VA") {
            this.virtualAcccount();
        }
    }

    private void bankTransfer() {
        System.out.print("Sending money by transfer");
    }

    private void virtualAcccount() {
        System.out.print("Sending money by VA");
    }
}