package by.makei.spring.spring_introduction.configuration_by_java;

import by.makei.spring.spring_introduction.configuration_by_java.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import by.makei.spring.spring_introduction.configuration_by_java.bean.AbstractPet;
import by.makei.spring.spring_introduction.configuration_by_java.bean.Owner;

@Configuration
public class AppConfig2 {

    @Bean
    public AbstractPet petBean() {
        return new Dog();
    }

    @Bean
    public Owner ownerBean() {
        return new Owner(petBean());
    }


}
