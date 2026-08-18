package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * @Component tells Spring:
 *
 * "I want Spring to create and manage an object
 * of OrderService."
 *
 * Therefore OrderService becomes a Spring Bean.
 */
@Component
public class OrderService {

    /*
     * This is the DEPENDENCY of OrderService.
     *
     * OrderService depends on PaymentService because
     * an order cannot be placed in our example
     * until payment is completed.
     *
     * Notice that we are using the INTERFACE:
     *
     *     PaymentService
     *
     * and NOT:
     *
     *     UpiPayment
     *
     * This keeps OrderService loosely coupled.
     *
     * OrderService does not care whether payment happens through:
     *
     * - UPI
     * - Card
     * - Net Banking
     * - Wallet
     *
     * It only knows that PaymentService has a pay() method.
     */
    private PaymentService payment;


    /*
     * OLD / TIGHTLY COUPLED APPROACH
     *
     * We could have done something like:
     *
     *     private PaymentService payment = new PaymentService();
     *
     * But this is wrong because PaymentService is an interface
     * and cannot be instantiated directly.
     *
     * Even if we did:
     *
     *     private PaymentService payment = new UpiPayment();
     *
     * it would tightly couple OrderService to UpiPayment.
     *
     * OrderService would be responsible for creating its own dependency.
     *
     * Instead, we want the dependency to be provided from outside.
     */


    /*
     * @Autowired
     *
     * This tells Spring to automatically inject the required
     * dependency into this constructor.
     *
     * This is called:
     *
     * CONSTRUCTOR INJECTION
     *
     * Spring is creating the OrderService object.
     *
     * While creating it, Spring sees this constructor:
     *
     *     OrderService(PaymentService payment)
     *
     * Spring looks inside the IoC Container for a suitable
     * PaymentService Bean and passes it into this constructor.
     *
     * In our case:
     *
     *     UpiPayment  -> @Primary
     *     CardPayment -> normal candidate
     *
     * Since UpiPayment has @Primary, Spring chooses UpiPayment.
     */
    @Autowired
    public OrderService(PaymentService payment) {

        /*
         * Store the dependency received from Spring
         * inside our instance variable.
         *
         * "this.payment" = instance variable
         * "payment"      = constructor parameter
         */
        this.payment = payment;
    }


    /*
     * placeOrder() represents our business logic.
     *
     * First:
     *     Payment is completed.
     *
     * Then:
     *     Order is placed.
     */
    public void placeOrder() {

        // Calling the injected PaymentService.
        payment.pay();

        // Simulating order placement.
        System.out.println("Order Placed");
    }
}