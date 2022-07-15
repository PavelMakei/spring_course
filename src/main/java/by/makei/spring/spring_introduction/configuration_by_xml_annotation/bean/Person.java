package by.makei.spring.spring_introduction.configuration_by_xml_annotation.bean;

public class Person {
    private Pet pet;
    private String name;
    private String surname;

//    public Person(Pet pet) {
//        this.pet = pet;
//    }

    public Person(Pet pet, String name, String surname) {
        this.pet = pet;
        this.name = name;
        this.surname = surname;
    }

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
}
