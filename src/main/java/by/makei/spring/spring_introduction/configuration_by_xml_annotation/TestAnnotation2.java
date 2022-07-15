package by.makei.spring.spring_introduction.configuration_by_xml_annotation;

import by.makei.spring.spring_introduction.configuration_by_xml_annotation.bean.PersonAnnotated2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        PersonAnnotated2 personAnnotated2 = context.getBean("personAnnotated2", PersonAnnotated2.class);
        personAnnotated2.callYourPet();
        context.close();
    }
}
