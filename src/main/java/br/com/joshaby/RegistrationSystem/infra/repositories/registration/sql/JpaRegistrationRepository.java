package br.com.joshaby.RegistrationSystem.infra.repositories.registration.sql;

import br.com.joshaby.RegistrationSystem.infra.models.registration.RegistrationModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaRegistrationRepository extends JpaRepository<RegistrationModel, Long> {

    Optional<RegistrationModel> findByRegistrationNumber(String registrationNumber);
}
