package org.me.learning.oauth2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(auth-> auth.anyRequest().authenticated())
                .oauth2Login(Customizer.withDefaults())
                .build();

//        ! now this is the complete code for this , we have to go to google cloud console to get and create an account to get the cred. that we should put in the application properties , it is a token given by these websites
    }
}
