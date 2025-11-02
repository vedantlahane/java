package DesignPatterns.Basics.OPPs;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("VedantDebitCard", new DebitCard("1234567890123456", "Vedant"));
        paymentService.addPaymentMethod("VedantCreditCard", new CreditCard("6543210987654321", "Vedant"));
        paymentService.addPaymentMethod("VedantUPI", new UPI("vedant@upi", "Vedant"));
        paymentService.addPaymentMethod("VedantWallet", new Wallet());

        paymentService.makePayment("VedantDebitCard");
        paymentService.makePayment("VedantCreditCard");
        paymentService.makePayment("VedantUPI");
        paymentService.makePayment("VedantWallet");
    }
}
