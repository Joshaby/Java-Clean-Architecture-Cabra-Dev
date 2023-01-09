package br.com.joshaby.RegistrationSystem.domain.valueobjects.exceptions;

public class EmailException extends RuntimeException {

    public EmailException(String message) {
        super(message);
    }

    public EmailException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
