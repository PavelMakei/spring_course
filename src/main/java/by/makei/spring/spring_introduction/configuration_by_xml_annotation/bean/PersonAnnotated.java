package by.makei.spring.spring_introduction.configuration_by_xml_annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")// by default
public class PersonAnnotated {
    private Pet pet;
    private String name;
    private String surname;

//    @Autowired//DI by constructor
    public PersonAnnotated(Pet snake1) { //find bean by name "snake" in this case
        this.pet = snake1;
    }

    public PersonAnnotated() {
    }
//@Autowired
//    public PersonAnnotated(Pet pet, String name, String surname) {
//        this.pet = pet;
//        this.name = name;
//        this.surname = surname;
//    }

    public void callYourPet(){
        System.out.println(name + ": Hello, my lovely pet");
        pet.say();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }
@Autowired //DI by setter. Will be used dependency by id "snake" in this case
    public void setPet(Pet dog) {
        this.pet = dog;
    }
}
