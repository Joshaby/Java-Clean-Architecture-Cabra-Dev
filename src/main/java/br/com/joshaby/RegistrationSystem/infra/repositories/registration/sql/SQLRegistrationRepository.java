package br.com.joshaby.RegistrationSystem.infra.repositories.registration.sql;

import br.com.joshaby.RegistrationSystem.domain.entities.registration.Registration;
import br.com.joshaby.RegistrationSystem.domain.entities.registration.RegistrationFactory;
import br.com.joshaby.RegistrationSystem.domain.repositories.LoadRegistrationRepository;
import br.com.joshaby.RegistrationSystem.domain.valueobjects.Cpf;
import br.com.joshaby.RegistrationSystem.infra.models.registration.RegistrationModel;
import br.com.joshaby.RegistrationSystem.infra.models.exceptions.RegistrationModelException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class SQLRegistrationRepository implements LoadRegistrationRepository {

    private final JpaRegistrationRepository repository;

    private final RegistrationFactory registrationFactory;

    @Override
    public Registration loadByRegistrationNumber(Cpf registrationNumber) {
        RegistrationModel model = repository.findByRegistrationNumber(registrationNumber.value())
                .orElseThrow(() -> new RegistrationModelException("CPF does not exist"));

        return registrationFactory.create(
                model.getName(),
                model.getEmail(),
                model.getBirthDate().toString(),
                model.getRegistrationNumber(),
                model.getRegistrationAt().toString());
    }
}
