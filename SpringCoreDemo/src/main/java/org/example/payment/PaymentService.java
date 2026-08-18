package org.example.payment;

/*
 * PaymentService is an INTERFACE.
 *
 * Why use an interface?
 *
 * OrderService should not care HOW payment is made.
 *
 * It only needs to know:
 *
 * "I have a PaymentService and it has a pay() method."
 *
 * Different payment implementations can then be created:
 *
 * - UpiPayment
 * - CardPayment
 * - Future: NetBankingPayment
 * - Future: WalletPayment
 *
 * This gives us loose coupling.
 *
 * IMPORTANT:
 *
 * We do NOT put @Component on the interface.
 *
 * @Component tells Spring to create/manage an object of a class.
 * An interface itself cannot be instantiated.
 */
public interface PaymentService {

    // Every implementation of PaymentService must implement pay().
    void pay();
}