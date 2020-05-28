package org.pk.siwz.simpleauth.config;

import org.pk.siwz.simpleauth.data.ApplicationRepository;
import org.pk.siwz.simpleauth.data.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Autowired
    ApplicationRepository applicationRepository;

    @Bean
    public void init() {
        if (!applicationRepository.existsByAppId("authservice")) {
            applicationRepository.save(new Application("authservice"));
        }
    }

}
