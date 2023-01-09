package br.com.joshaby.RegistrationSystem.infra.config;

import br.com.joshaby.RegistrationSystem.domain.entities.registration.RegistrationFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanDomainConfig {

    @Bean
    public RegistrationFactory registrationFactory() {
        return new RegistrationFactory();
    }
}
