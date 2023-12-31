package com.staffinghub.coding.challenges.retry.core.outbound;

import com.staffinghub.coding.challenges.retry.core.entities.EmailNotification;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface NotificationSender {

    void sendEmail(@Valid @NotNull EmailNotification emailNotification);
}
