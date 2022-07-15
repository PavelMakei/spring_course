package by.makei.spring.spring_introduction.configuration_by_java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring_introduction.configuration_by_java")
@PropertySource("classpath:application1.properties")
public class AppConfig {
}
