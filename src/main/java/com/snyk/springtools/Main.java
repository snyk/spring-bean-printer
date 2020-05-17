package com.snyk.springtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> originalApp = ContextUtils.findBootApplicationInClasspath();

        SpringApplication application = new SpringApplication(originalApp);

        application.addListeners((ApplicationListener<ApplicationStartedEvent>) event -> {
            ContextUtils.printBeansInContext(event.getApplicationContext());
            System.exit(0);
        });

        application.run(args);
    }

    
}
