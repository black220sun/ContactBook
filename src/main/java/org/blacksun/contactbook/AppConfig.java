package org.blacksun.contactbook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@Configuration
@ComponentScan("org.blacksun.contactbook")
public class AppConfig {
    @Bean
    public String getTitle() {
        return "ContactBook";
    }

    @Bean
    public Dimension getDimension() {
        return new Dimension(1200, 600);
    }
}
