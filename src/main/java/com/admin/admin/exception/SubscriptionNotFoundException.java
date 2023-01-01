package com.admin.admin.exception;

public class SubscriptionNotFoundException extends RuntimeException {
    public SubscriptionNotFoundException(Long id) {
        super("Could not found the Subscription with id " + id);
    }
}
