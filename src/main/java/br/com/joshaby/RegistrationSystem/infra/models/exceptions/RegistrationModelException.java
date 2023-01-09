package br.com.joshaby.RegistrationSystem.infra.models.exceptions;

public class RegistrationModelException extends RuntimeException {

    public RegistrationModelException(String message) {
        super(message);
    }

    public RegistrationModelException(String message, Throwable throwable) {
        super(message, throwable);
    }
}