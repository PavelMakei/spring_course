package by.makei.spring.spring_introduction.configuration_by_java.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dogBean")
@Scope("prototype")
public class Dog extends AbstractPet{
    @Override
    public void say() {
        System.out.println(getName() + ": Gav-gav");
    }
}
