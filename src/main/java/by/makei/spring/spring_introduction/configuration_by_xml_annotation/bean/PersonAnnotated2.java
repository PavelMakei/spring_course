package by.makei.spring.spring_introduction.configuration_by_xml_annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PersonAnnotated2 {
    @Autowired
    @Qualifier(value = "snake")
    private Pet pet;
    private String name;
    private String surname;


    public PersonAnnotated2() {
    }


    public void callYourPet(){
        System.out.println(name + ": Hello, my lovely pet");
        pet.say();
    }



}
