package br.com.joshaby.application.usecases.exportregistration;

import br.com.joshaby.application.contracts.ExportRegistrationPdfExporter;
import br.com.joshaby.application.contracts.Storage;
import br.com.joshaby.domain.entities.registration.Registration;
import br.com.joshaby.domain.repositories.LoadRegistrationRepository;
import br.com.joshaby.domain.valueobjects.Cpf;

import java.io.File;

public class ExportRegistration {

    private final LoadRegistrationRepository repository;

    private final ExportRegistrationPdfExporter exporter;

    private final Storage storage;

    public ExportRegistration(LoadRegistrationRepository repository, ExportRegistrationPdfExporter exporter, Storage storage) {
        this.repository = repository;
        this.exporter = exporter;
        this.storage = storage;
    }

    public OutputBoundary handle(InputBoundary input) {
        Cpf cpf = new Cpf(input.getRegistrationNumber());
        Registration registration = repository.loadByRegistrationNumber(cpf);

        String fileContent = exporter.generate(registration);
        storage.store(input.getPdfFileName(), input.getPath(), fileContent);

        return new OutputBoundary(input.getPath() + File.pathSeparator + input.getPdfFileName());
    }
}
