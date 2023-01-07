package br.com.joshaby;

import br.com.joshaby.application.contracts.ExportRegistrationPdfExporter;
import br.com.joshaby.application.contracts.Storage;
import br.com.joshaby.application.usecases.exportregistration.ExportRegistration;
import br.com.joshaby.application.usecases.exportregistration.InputBoundary;
import br.com.joshaby.application.usecases.exportregistration.OutputBoundary;
import br.com.joshaby.domain.entities.registration.Registration;
import br.com.joshaby.domain.repositories.LoadRegistrationRepository;
import br.com.joshaby.domain.valueobjects.Cpf;
import br.com.joshaby.domain.valueobjects.Email;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        // Entities

        Registration registration = new Registration()
                .setName("José Henrique")
                .setBirthDate(LocalDateTime.of(2001, 2, 22, 15, 0, 32))
                .setEmail(new Email("jose@gmail.com"))
                .setRegistrationNumber(new Cpf("01234567890"))
                .setRegistrationAt(LocalDateTime.of(2023, 1, 7, 17, 45, 32));

        // Use cases

        LoadRegistrationRepository repository = null;
        ExportRegistrationPdfExporter exporter = null;
        Storage storage = null;

        ExportRegistration exportRegistration = new ExportRegistration(repository, exporter, storage);
        InputBoundary input = new InputBoundary("01234567890", "xpto", "/home/jose");
        OutputBoundary output = exportRegistration.handle(input);
    }
}
