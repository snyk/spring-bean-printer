package com.snyk.springtools;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerExampleBean {

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ContextUtils.printBeansInContext(event.getApplicationContext());
        System.exit(0);
    }
}