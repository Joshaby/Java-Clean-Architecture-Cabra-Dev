package br.com.joshaby.domain.repositories;

import br.com.joshaby.domain.entities.registration.Registration;
import br.com.joshaby.domain.valueobjects.Cpf;

public interface LoadRegistrationRepository {

    Registration loadByRegistrationNumber(Cpf cpf);
}
