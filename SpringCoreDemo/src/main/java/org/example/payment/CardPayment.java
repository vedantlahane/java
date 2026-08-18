package org.example.payment;

import org.springframework.stereotype.Component;

/*
 * @Component tells Spring to create and manage
 * an object of CardPayment as a Spring Bean.
 *
 * Therefore CardPayment is also a Spring Bean.
 *
 * Now our application has TWO implementations
 * of PaymentService:
 *
 * 1. UpiPayment
 * 2. CardPayment
 */
@Component
public class CardPayment implements PaymentService {

    @Override
    public void pay() {

        System.out.println("Paying via Card Payment");
    }
}