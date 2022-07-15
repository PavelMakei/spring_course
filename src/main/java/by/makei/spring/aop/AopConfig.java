package by.makei.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("by.makei.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
