package br.com.joshaby.RegistrationSystem.infra.controllers;

import br.com.joshaby.RegistrationSystem.application.usecases.exportregistration.ExportRegistration;
import br.com.joshaby.RegistrationSystem.application.usecases.exportregistration.InputBoundary;
import br.com.joshaby.RegistrationSystem.infra.presentation.ExportRegistrationPresentation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/registration")
@RequiredArgsConstructor
public class ExportRegistrationController {

    private final ExportRegistration exportRegistration;

    private final ExportRegistrationPresentation presentation;

    @PutMapping("/pdf")
    public ResponseEntity<?> handle(@RequestBody InputBoundary input) throws IOException {
        return presentation.output(exportRegistration.handle(input));
    }
}
