package br.com.joshaby.RegistrationSystem.infra.controllers;

import br.com.joshaby.RegistrationSystem.application.usecases.exportregistration.OutputBoundary;
import org.springframework.http.ResponseEntity;

public interface RegistrationPresentation {

    ResponseEntity<?> output(OutputBoundary output);
}
