package com.snyk.springtools;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> originalApp = ContextUtils.findBootApplicationInClasspath();

        SpringApplication application = new SpringApplication(originalApp);

        application.addListeners((ApplicationListener<ContextRefreshedEvent>) event -> {
            ContextUtils.printBeansInContext(event.getApplicationContext());
            System.exit(0);
        });

        application.setLogStartupInfo(false);

        application.run(args);
    }

    
}
