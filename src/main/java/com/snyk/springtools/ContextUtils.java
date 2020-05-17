package com.snyk.springtools;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

public class ContextUtils {

    public static Class<?> findBootApplicationInClasspath() throws ClassNotFoundException {
        ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
        scanner.addIncludeFilter(new AnnotationTypeFilter(SpringBootApplication.class));

        for (BeanDefinition bd : scanner.findCandidateComponents("com")) {
            System.out.println("found a SpringBootApplication: " + bd.getBeanClassName());
            return Class.forName(bd.getBeanClassName());
        }

        return null;
    }

    public static Class<?> findApplicationInContext(ApplicationContext applicationContext) {
        Map<String, Object> candidates = applicationContext.getBeansWithAnnotation(SpringBootApplication.class);
        
        if (!candidates.isEmpty()) {
            Class<?> app = candidates.values().toArray()[0].getClass();
            System.out.println("found a SpringBootApplication: " + app);
            return app;
        }
        
        return null;
    }

    public static void printBeansInContext(ApplicationContext applicationContext) {
        Arrays.stream(applicationContext.getBeanDefinitionNames())
            .sorted()
            .map(beanName -> applicationContext.getBean(beanName).getClass())
            .forEach(System.out::println);
    }

    public static void printAllBeansUsingEndpoint(ConfigurableApplicationContext configurableApplicationContext) {
        BeansEndpoint beansEndpoint = new BeansEndpoint(configurableApplicationContext);
        
        beansEndpoint.beans().getContexts().keySet().forEach(context -> beansEndpoint.beans().getContexts().get(context).getBeans().keySet().stream()
            .sorted()
            .forEach(System.out::println));
    }
}
