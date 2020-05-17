package com.snyk.springtools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RunnerPrinter implements CommandLineRunner {

    @Autowired
    public ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        ContextUtils.printBeansInContext(applicationContext);
        System.exit(0);
    }
}
