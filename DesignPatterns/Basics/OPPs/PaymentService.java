package DesignPatterns.Basics.OPPs;
import java.util.HashMap;
public class PaymentService {
    HashMap<String, PaymentMethod> paymentMethods;

    public PaymentService() {
        paymentMethods = new HashMap<>();
    }
    public void addPaymentMethod(String name, PaymentMethod method){
        paymentMethods.put(name, method);
    }

    public void makePayment(String name){
        PaymentMethod method = paymentMethods.get(name);
        if(method != null){
            method.pay();// Run time polymorphism as pay() method of respective class will be called
        } else {
            System.out.println("Payment method not found");
        }
    }
}
