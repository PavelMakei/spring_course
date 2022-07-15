package by.makei.spring.spring_introduction.configuration_by_java;

import by.makei.spring.spring_introduction.configuration_by_java.bean.Owner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Owner owner = context.getBean("ownerBean", Owner.class);
        owner.askMyPet();
    }
}
