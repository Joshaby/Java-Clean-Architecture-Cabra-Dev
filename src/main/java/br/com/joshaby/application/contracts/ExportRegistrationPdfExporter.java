package br.com.joshaby.application.contracts;

import br.com.joshaby.domain.entities.registration.Registration;

import java.util.Map;

public interface ExportRegistrationPdfExporter {

    String generate(Registration registration);
}
