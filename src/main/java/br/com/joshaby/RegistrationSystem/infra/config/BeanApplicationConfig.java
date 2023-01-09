package br.com.joshaby.RegistrationSystem.infra.config;

import br.com.joshaby.RegistrationSystem.application.contracts.RegistrationToHtmlConverter;
import br.com.joshaby.RegistrationSystem.application.contracts.Storage;
import br.com.joshaby.RegistrationSystem.application.usecases.exportregistration.ExportRegistration;
import br.com.joshaby.RegistrationSystem.domain.repositories.LoadRegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanApplicationConfig {

    private final Storage storage;

    private final RegistrationToHtmlConverter converter;

    private final LoadRegistrationRepository repository;

    @Bean
    public ExportRegistration exportRegistration() {
        return new ExportRegistration(repository, converter, storage);
    }
}
