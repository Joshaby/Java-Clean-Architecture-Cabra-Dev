package br.com.joshaby.RegistrationSystem.application.contracts;

import br.com.joshaby.RegistrationSystem.domain.entities.registration.Registration;

public interface RegistrationToHtmlConverter {

    String generate(Registration registration);
}
