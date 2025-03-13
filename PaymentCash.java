public class PaymentCash extends Payment {
    private String adminId;
    private String branchId;

    public PaymentCash(String adminId, String branchId, String customerId) {
        super(customerId);
        this.adminId = adminId;
        this.branchId = branchId;
    }

    public void pay(double amount) {
        System.out.println("Customer come to the branch and pay " + amount + " cash.");
    }
}