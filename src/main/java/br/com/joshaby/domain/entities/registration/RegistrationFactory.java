package br.com.joshaby.domain.entities.registration;

import br.com.joshaby.domain.valueobjects.Cpf;
import br.com.joshaby.domain.valueobjects.Email;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistrationFactory {

    public Registration create(String name, String email, String birthDate,
                               String registrationNumber, String registrationAt) {

        LocalDateTime birthDateLocalDateTime = LocalDateTime.parse(
                birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        LocalDateTime registrationAtDateTime = LocalDateTime.parse(
                registrationAt, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        Registration registration = new Registration();
        return registration
                .setName(name)
                .setEmail(new Email(email))
                .setBirthDate(birthDateLocalDateTime)
                .setRegistrationNumber(new Cpf(registrationNumber))
                .setRegistrationAt(registrationAtDateTime);
    }
}
