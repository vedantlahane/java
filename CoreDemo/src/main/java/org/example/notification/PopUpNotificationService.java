package org.example.notification;

/*
 * Third implementation of NotificationService.
 *
 * This demonstrates that multiple concrete classes
 * can implement the same interface.
 */
public class PopUpNotificationService implements NotificationService {

    @Override
    public void sendNotification() {

        System.out.println("Pop-Up Notification Sent");
    }
}