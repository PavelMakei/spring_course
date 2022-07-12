package spring_introduction;

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
