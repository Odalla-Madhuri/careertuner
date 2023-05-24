package com.hobbi.handler;

@SuppressWarnings("serial")
public class FailToDeleteException extends RuntimeException {
    public FailToDeleteException(String message) {
        super(message);
    }
}
