package by.makei.spring.spring_introduction.configuration_by_xml_annotation;

import by.makei.spring.spring_introduction.configuration_by_xml_annotation.bean.PersonAnnotated;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation1 {
    public static void main(String[] args) {
//        Pet pet = new Dog();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Pet pet = context.getBean("pet", Pet.class);
        PersonAnnotated person1 = context.getBean("personAnnotated", PersonAnnotated.class);

        person1.callYourPet();

        context.close();//TODO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    }
}
