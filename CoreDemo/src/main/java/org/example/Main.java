package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;

public class Main {

    public static void main(String[] args) {

        /*
         * Create the actual/concrete dependency.
         *
         * Here we are choosing EmailService.
         *
         * But the variable type is NotificationService
         * because we want to program against the interface.
         */
        NotificationService notification = new EmailService();


        /*
         * DEPENDENCY INJECTION happens here.
         *
         * We are giving the NotificationService object
         * to OrderService through its constructor.
         *
         * OrderService does NOT create this object itself.
         */
        OrderService order = new OrderService(notification);


        /*
         * Now OrderService can use the injected dependency.
         */
        order.placeOrder();
    }
}