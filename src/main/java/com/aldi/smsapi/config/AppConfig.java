package com.aldi.smsapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("spring/appContext.xml")
public class AppConfig {
    // Importing older config by annotation
}
