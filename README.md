# spring-bean-printer

## Usage:
Build utility:
```
mvn clean package
```

Inside target application folder, run:
```
mvn spring-boot:run -Dspring-boot.run.folders=$(realpath /path/to/spring-bean-printer/target/classes/) -Dstart-class=com.snyk.springtools.Main
```

This should give you the beans (some of them) used by the target Spring Boot application, and exit immediately.
```
 mvn -q spring-boot:run -Dspring-boot.run.folders=$(realpath ../../snyk/spring-bean-printer/target/classes/) -Dstart-class=com.snyk.springtools.Main
15:12:55.201 [main] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [/Users/.../target/classes/com/example/demo/DemoApplication.class]
found a SpringBootApplication: com.example.demo.DemoApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.6.RELEASE)

2020-05-17 15:12:55.418  INFO 12539 --- [           main] com.snyk.springtools.Main                : Starting Main on mikis-mbp.lan with PID 12539 (/Users/.../spring-bean-printer/target/classes started by miki in /Users/...)
2020-05-17 15:12:55.419  INFO 12539 --- [           main] com.snyk.springtools.Main                : No active profile set, falling back to default profiles: default
2020-05-17 15:12:55.682  INFO 12539 --- [           main] com.snyk.springtools.Main                : Started Main in 0.445 seconds (JVM running for 0.761)
2020-05-17 15:12:55.691  INFO 12539 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
class org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor
class com.example.demo.DemoApplication$CliExecutor
class com.example.demo.DemoApplication$$EnhancerBySpringCGLIB$$58269592
class org.springframework.aop.framework.autoproxy.InfrastructureAdvisorAutoProxyCreator
class org.springframework.boot.autoconfigure.AutoConfigurationPackages$BasePackages
class org.springframework.boot.autoconfigure.aop.AopAutoConfiguration
class org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration
class org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration
class org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration
class org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration
class org.springframework.boot.type.classreading.ConcurrentReferenceCachingMetadataReaderFactory
class org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration
class org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration
class org.springframework.boot.context.properties.ConfigurationPropertiesBinder
class org.springframework.boot.context.properties.ConfigurationPropertiesBinder$Factory
class org.springframework.boot.context.properties.ConfigurationBeanFactoryMetadata
class org.springframework.boot.context.properties.ConfigurationPropertiesBeanDefinitionValidator
class org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor
class org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor
class org.springframework.context.annotation.CommonAnnotationBeanPostProcessor
class org.springframework.context.annotation.ConfigurationClassPostProcessor
class org.springframework.context.event.DefaultEventListenerFactory
class org.springframework.context.event.EventListenerMethodProcessor
class org.springframework.context.support.PropertySourcesPlaceholderConfigurer
class org.springframework.boot.autoconfigure.info.ProjectInfoProperties
class org.springframework.boot.autoconfigure.task.TaskExecutionProperties
class org.springframework.boot.autoconfigure.task.TaskSchedulingProperties
class org.springframework.boot.task.TaskExecutorBuilder
class org.springframework.boot.task.TaskSchedulerBuilder
2020-05-17 15:12:55.705  INFO 12539 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'