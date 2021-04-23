package com.annieliu.test.hello.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HelloJenkinsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(HelloJenkinsApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HelloJenkinsApplication.class);
    }
}
