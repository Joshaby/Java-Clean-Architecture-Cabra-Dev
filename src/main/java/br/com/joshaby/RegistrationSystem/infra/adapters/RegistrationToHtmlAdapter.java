package br.com.joshaby.RegistrationSystem.infra.adapters;

import br.com.joshaby.RegistrationSystem.application.contracts.RegistrationToHtmlConverter;
import br.com.joshaby.RegistrationSystem.domain.entities.registration.Registration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


@Service
@RequiredArgsConstructor
public class RegistrationToHtmlAdapter implements RegistrationToHtmlConverter {

    private final TemplateEngine templateEngine;

    @Override
    public String generate(Registration registration) {
        Context context = new Context();
        context.setVariable("registration", registration);
        return templateEngine.process("registration.html", context);
    }
}
