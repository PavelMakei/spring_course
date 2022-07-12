package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Dog();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Pet pet = context.getBean("pet", Pet.class);
        Person person = context.getBean("person", Person.class);
        person.callYourPet();

    }
}
