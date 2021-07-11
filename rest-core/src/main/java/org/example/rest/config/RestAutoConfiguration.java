package org.example.rest.config;

import org.example.rest.message.PageResponseGenerator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.rest")
public class RestAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    PageResponseGenerator pageResponseGenerator() {
        return new PageResponseGenerator();
    }

}
