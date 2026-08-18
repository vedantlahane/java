package org.example.notification;

/*
 * EmailService is a concrete implementation of NotificationService.
 *
 * "implements" means this class promises to provide
 * an implementation of all methods defined in the interface.
 */
public class EmailService implements NotificationService {

    @Override
    public void sendNotification() {

        // Actual application could send an email here.
        // For learning, we are simply printing a message.
        System.out.println("Email Notification Sent");
    }
}