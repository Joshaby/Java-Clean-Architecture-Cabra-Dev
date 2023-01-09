package br.com.joshaby.RegistrationSystem.application.usecases.exportregistration;

import br.com.joshaby.RegistrationSystem.application.contracts.RegistrationToHtmlConverter;
import br.com.joshaby.RegistrationSystem.application.contracts.Storage;
import br.com.joshaby.RegistrationSystem.domain.entities.registration.Registration;
import br.com.joshaby.RegistrationSystem.domain.repositories.LoadRegistrationRepository;
import br.com.joshaby.RegistrationSystem.domain.valueobjects.Cpf;

import java.io.File;
import java.io.IOException;

public class ExportRegistration {

    private final LoadRegistrationRepository repository;

    private final RegistrationToHtmlConverter converter;

    private final Storage storage;

    public ExportRegistration(LoadRegistrationRepository repository, RegistrationToHtmlConverter exporter, Storage storage) {
        this.repository = repository;
        this.converter = exporter;
        this.storage = storage;
    }

    public OutputBoundary handle(InputBoundary input) throws IOException {
        Cpf cpf = new Cpf(input.getRegistrationNumber());
        Registration registration = repository.loadByRegistrationNumber(cpf);

        String fileContent = converter.generate(registration);
        storage.store(input.getPdfFileName(), input.getPath() + File.separator, fileContent);

        return new OutputBoundary(input.getPath() + File.separator + input.getPdfFileName());
    }
}
