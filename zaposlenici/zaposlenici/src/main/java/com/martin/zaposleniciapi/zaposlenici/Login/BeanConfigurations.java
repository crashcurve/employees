package com.martin.zaposleniciapi.zaposlenici.Login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * Created by i.mihalina on 12.6.2017..
 */
@Configuration
public class BeanConfigurations {
    @Bean
    public AuthenticationSuccessHandler authenticationSuccessHandler() {
        return new AuthenticationSuccessHandlerImpl();
    }
}
