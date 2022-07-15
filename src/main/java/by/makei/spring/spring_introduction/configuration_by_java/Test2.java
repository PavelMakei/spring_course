package by.makei.spring.spring_introduction.configuration_by_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import by.makei.spring.spring_introduction.configuration_by_java.bean.Owner;

public class Test2 {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
        Owner owner = context.getBean("ownerBean", Owner.class);
        owner.askMyPet();
    }
}
