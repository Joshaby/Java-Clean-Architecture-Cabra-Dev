package br.com.joshaby.RegistrationSystem.infra.presentation;

import br.com.joshaby.RegistrationSystem.application.usecases.exportregistration.OutputBoundary;
import br.com.joshaby.RegistrationSystem.infra.controllers.RegistrationPresentation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ExportRegistrationPresentation implements RegistrationPresentation {

    @Override
    public ResponseEntity<?> output(OutputBoundary output) {
        return ResponseEntity.ok().body(output);
    }
}
