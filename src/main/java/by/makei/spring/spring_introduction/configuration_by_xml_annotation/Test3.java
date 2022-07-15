package by.makei.spring.spring_introduction.configuration_by_xml_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import by.makei.spring.spring_introduction.configuration_by_xml_annotation.bean.Person;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Dog();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Pet pet = context.getBean("pet", Pet.class);
        Person person = context.getBean("person", Person.class);
        person.callYourPet();

        context.close();//TODO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    }
}
