package org.pk.siwz.simpleauth.config;

import org.pk.siwz.simpleauth.data.UserRepository;
import org.pk.siwz.simpleauth.data.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Bean
    public void init() {
        if (userRepository.count() < 1) {
            userRepository.save(new User(null, "admin@localhost", passwordEncoder.encode("admin"), User.Role.ADMIN));
        }
    }

}
