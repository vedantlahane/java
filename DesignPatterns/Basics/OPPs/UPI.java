package DesignPatterns.Basics.OPPs;

public class UPI implements PaymentMethod {
    private String upiId;
    private String userName;

    public UPI(String upiId, String userName) {
        this.upiId = upiId;
        this.userName = userName;
    }

    public String getUpiId() {
        return upiId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public void pay() {
        System.out.println("Payment made using UPI: " + upiId);
    }
    
}
