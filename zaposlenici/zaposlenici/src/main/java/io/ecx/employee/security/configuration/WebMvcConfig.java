package io.ecx.employee.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by i.mihalina on 16.6.2017..
 */
@Configuration
public class WebMvcConfig
{

    @Bean
    public BCryptPasswordEncoder passwordEncoder()
    {
        final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
}
