package com.nt.niranjana.jenkins.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public java.util.Calendar calendar() {
        return new java.util.GregorianCalendar();
    }
}
