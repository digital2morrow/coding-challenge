package com.staffinghub.coding.challenges.retry.core.logic;

import com.staffinghub.coding.challenges.retry.core.entities.EmailNotification;
import com.staffinghub.coding.challenges.retry.core.inbound.NotificationHandler;
import com.staffinghub.coding.challenges.retry.core.outbound.NotificationSender;

public class NotificationService implements NotificationHandler {

    private NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Override
    public EmailNotification processEmailNotification(EmailNotification emailNotification) {
        notificationSender.sendEmail(emailNotification);
        return emailNotification;
    }
}
