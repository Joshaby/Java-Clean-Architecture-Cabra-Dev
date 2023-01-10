package br.com.joshaby.RegistrationSystem.infra.controllers;

import br.com.joshaby.RegistrationSystem.application.usecases.exportregistration.ExportRegistration;
import br.com.joshaby.RegistrationSystem.application.usecases.exportregistration.InputBoundary;
import br.com.joshaby.RegistrationSystem.application.usecases.exportregistration.OutputBoundary;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/registration")
@RequiredArgsConstructor
public class RegistrationController {

    private final ExportRegistration exportRegistration;

    @PutMapping("/pdf")
    public OutputBoundary generatePdf(@RequestBody InputBoundary input) throws IOException {
        return exportRegistration.handle(input);
    }
}
