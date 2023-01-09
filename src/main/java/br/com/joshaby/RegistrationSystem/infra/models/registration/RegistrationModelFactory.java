package br.com.joshaby.RegistrationSystem.infra.models.registration;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class RegistrationModelFactory {

    public RegistrationModel create(String name, String email, LocalDateTime birthDate,
                                    String registrationNumber, LocalDateTime registrationAt) {

        return RegistrationModel.builder()
                .name(name)
                .email(email)
                .birthDate(birthDate)
                .registrationNumber(registrationNumber)
                .registrationAt(registrationAt)
                .build();
    }
}
