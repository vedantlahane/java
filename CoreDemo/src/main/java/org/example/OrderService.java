package org.example;

import org.example.notification.NotificationService;

/*
 * OrderService handles ORDER-related business logic.
 *
 * IMPORTANT:
 *
 * OrderService needs a NotificationService,
 * but it should NOT create the NotificationService itself.
 *
 * This is the key idea behind Dependency Injection.
 */
public class OrderService {

    /*
     * This is our DEPENDENCY.
     *
     * OrderService depends on NotificationService because
     * after placing an order, it needs to send a notification.
     *
     * Notice that we are using the INTERFACE type,
     * not EmailService directly.
     *
     * This allows us to use:
     * - EmailService
     * - SmsService
     * - PopUpNotificationService
     * - Any future NotificationService implementation
     */
    private NotificationService notification;


    /*
     * CONSTRUCTOR INJECTION
     *
     * Instead of doing this inside OrderService:
     *
     *     notification = new EmailService();
     *
     * we ask the outside world to provide the dependency.
     *
     * In other words:
     *
     * "I need a NotificationService.
     *  You give me one, and I'll use it."
     */
    public OrderService(NotificationService notification) {

        // Store the dependency provided from outside.
        this.notification = notification;
    }


    /*
     * Business logic of OrderService.
     *
     * OrderService's responsibility is to handle the order.
     *
     * It does NOT create the notification object.
     *
     * It simply uses the dependency that was provided to it.
     */
    public void placeOrder() {

        // Simulating order placement.
        System.out.println("Order Placed");

        /*
         * Send notification after placing the order.
         *
         * Because notification is an interface reference,
         * Java will call the implementation of the actual object
         * that was provided.
         */
        notification.sendNotification();
    }
}