package com.devopsbuddy.config;

import com.devopsbuddy.backend.service.EmailService;
import com.devopsbuddy.backend.service.SmtpEmailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by kumar sunkara.
 */
@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/Kumar/KumarWorkspace/devopsbuddy/application-prod.properties")
public class ProductionConfig {
    @Bean
    public EmailService emailService() {
        return new SmtpEmailService();
    }

   /* @Value("${stripe.prod.private.key}")
    private String stripeProdKey;

    @Bean
    public EmailService emailService() {
        return new SmtpEmailService();
    }

    @Bean
    public String stripeKey() {
        return stripeProdKey;
    }*/
}
