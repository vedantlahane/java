package org.example.notification;

/*
 * NotificationService is an INTERFACE.
 *
 * Why do we need an interface?
 *
 * OrderService should not care whether the notification is:
 * - Email
 * - SMS
 * - Pop-up
 *
 * It only needs to know:
 *
 * "I have a notification service and it can sendNotification()."
 *
 * This helps us achieve LOOSE COUPLING.
 */
public interface NotificationService {

    // Every notification implementation must provide this method.
    void sendNotification();
}