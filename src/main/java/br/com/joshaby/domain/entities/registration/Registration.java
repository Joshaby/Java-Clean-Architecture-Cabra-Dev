package br.com.joshaby.domain.entities.registration;

import br.com.joshaby.domain.valueobjects.Cpf;
import br.com.joshaby.domain.valueobjects.Email;

import java.time.LocalDateTime;

public class Registration {

    private String name;

    private Email email;

    private LocalDateTime birthDate;

    private Cpf registrationNumber;

    private LocalDateTime registrationAt;

    public String getName() {
        return name;
    }

    public Registration setName(String name) {
        this.name = name;
        return this;
    }

    public Email getEmail() {
        return email;
    }

    public Registration setEmail(Email email) {
        this.email = email;
        return this;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public Registration setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Cpf getRegistrationNumber() {
        return registrationNumber;
    }

    public Registration setRegistrationNumber(Cpf registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    public LocalDateTime getRegistrationAt() {
        return registrationAt;
    }

    public Registration setRegistrationAt(LocalDateTime registrationAt) {
        this.registrationAt = registrationAt;
        return this;
    }
}
