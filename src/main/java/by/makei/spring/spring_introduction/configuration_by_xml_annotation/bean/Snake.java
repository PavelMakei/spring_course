package by.makei.spring.spring_introduction.configuration_by_xml_annotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("snakeBean")//can be used id for this component, else Spring will use "snake". For class name with 2 capital letters FFoo will be used FFoo (without changes)
@Component
@Scope(scopeName = "prototype")
public class Snake implements Pet{
    @Value("${snake.name}")
    private String name;

    public Snake(String name) {
        System.out.println("Snake created");
        this.name = name;
    }

    public Snake() {
        System.out.println("Snake created");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println(getName()+": Ssshhhhhhh");
    }
}
