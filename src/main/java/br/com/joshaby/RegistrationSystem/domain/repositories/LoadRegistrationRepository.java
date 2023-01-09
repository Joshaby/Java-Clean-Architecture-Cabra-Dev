package br.com.joshaby.RegistrationSystem.domain.repositories;

import br.com.joshaby.RegistrationSystem.domain.entities.registration.Registration;
import br.com.joshaby.RegistrationSystem.domain.valueobjects.Cpf;

public interface LoadRegistrationRepository {

    Registration loadByRegistrationNumber(Cpf cpf);
}
