package org.example.notification;

/*
 * Another implementation of NotificationService.
 *
 * Notice that we didn't have to change NotificationService.
 * We simply created another implementation.
 */
public class SmsService implements NotificationService {

    @Override
    public void sendNotification() {

        System.out.println("Sms Notification Sent");
    }
}