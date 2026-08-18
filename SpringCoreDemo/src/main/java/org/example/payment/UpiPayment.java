package org.example.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
 * @Component tells Spring:
 *
 * "Create and manage an object of this class."
 *
 * Therefore, UpiPayment becomes a Spring Bean.
 *
 * The Spring IoC Container will create and manage this object.
 */
@Component


/*
 * @Primary is important when there are MULTIPLE implementations
 * of the same interface.
 *
 * We have:
 *
 *     UpiPayment implements PaymentService
 *     CardPayment implements PaymentService
 *
 * Therefore Spring finds TWO possible PaymentService beans.
 *
 * When OrderService asks for:
 *
 *     PaymentService payment
 *
 * Spring needs to know which implementation to inject.
 *
 * @Primary tells Spring:
 *
 * "Prefer this bean when multiple candidates are available."
 *
 * Therefore UpiPayment will be selected by default.
 */
@Primary
public class UpiPayment implements PaymentService {

    @Override
    public void pay() {

        System.out.println("Paying via Upi Payment");
    }
}