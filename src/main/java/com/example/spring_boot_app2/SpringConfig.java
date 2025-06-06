package com.example.spring_boot_app2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(registry -> {registry.requestMatchers("/").permitAll();
        registry.anyRequest().authenticated();
    }).oauth2Login(Customizer.withDefaults()).formLogin(Customizer.withDefaults()).build();
    }
}


