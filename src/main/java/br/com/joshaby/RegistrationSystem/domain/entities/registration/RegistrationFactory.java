package br.com.joshaby.RegistrationSystem.domain.entities.registration;

import br.com.joshaby.RegistrationSystem.domain.valueobjects.Cpf;
import br.com.joshaby.RegistrationSystem.domain.valueobjects.Email;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistrationFactory {

    public Registration create(String name, String email, String birthDate,
                               String registrationNumber, String registrationAt) {

        LocalDateTime birthDateLocalDateTime = LocalDateTime.parse(
                birthDate, DateTimeFormatter.ISO_DATE_TIME);

        LocalDateTime registrationAtDateTime = LocalDateTime.parse(
                registrationAt, DateTimeFormatter.ISO_DATE_TIME);

        return new Registration()
                .setName(name)
                .setEmail(new Email(email))
                .setBirthDate(birthDateLocalDateTime)
                .setRegistrationNumber(new Cpf(registrationNumber))
                .setRegistrationAt(registrationAtDateTime);
    }
}
