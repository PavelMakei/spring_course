package by.makei.spring.spring_introduction.configuration_by_xml_annotation;

import by.makei.spring.spring_introduction.configuration_by_xml_annotation.bean.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Pet pet = context.getBean("pet", Pet.class);
        pet.say();
        context.close(); //TODO!!!!!!!!!!!!!!!!! Обязательно закрывать контекст!
    }
}
