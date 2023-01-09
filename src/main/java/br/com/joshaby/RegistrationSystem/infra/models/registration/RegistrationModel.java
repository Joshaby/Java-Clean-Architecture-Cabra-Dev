package br.com.joshaby.RegistrationSystem.infra.models.registration;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_registration")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private LocalDateTime birthDate;

    private String registrationNumber;

    private LocalDateTime registrationAt;
}
