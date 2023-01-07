package br.com.joshaby.domain.valueobjects;

import br.com.joshaby.domain.valueobjects.exceptions.EmailException;

public class Email {

    private String email;

    public Email(String email) {
        if (email == null || !email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {

            throw new EmailException("Email is not valid");
        }
        this.email = email;
    }

    public String value() {
        return this.email;
    }
}
