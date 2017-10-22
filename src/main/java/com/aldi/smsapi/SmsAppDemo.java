package com.aldi.smsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.velocity.VelocityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = { VelocityAutoConfiguration.class, FreeMarkerAutoConfiguration.class })
public class SmsAppDemo extends SpringBootServletInitializer {

    public static void main(String[] args) {
	SpringApplication.run(SmsAppDemo.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	return builder.sources(SmsAppDemo.class);
    }

}
