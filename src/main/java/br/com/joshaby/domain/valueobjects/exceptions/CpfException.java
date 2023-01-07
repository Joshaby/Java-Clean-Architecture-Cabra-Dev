package br.com.joshaby.domain.valueobjects.exceptions;

public class CpfException extends RuntimeException {

    public CpfException(String message) {
        super(message);
    }

    public CpfException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
