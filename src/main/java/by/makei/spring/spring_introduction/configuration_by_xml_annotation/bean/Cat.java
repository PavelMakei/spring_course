package by.makei.spring.spring_introduction.configuration_by_xml_annotation.bean;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{
    private String name;
    @Override
    public void say() {
        System.out.println(getName()+": Meow-meow");
    }

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
