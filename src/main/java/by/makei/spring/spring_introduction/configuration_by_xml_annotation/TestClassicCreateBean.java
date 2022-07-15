package by.makei.spring.spring_introduction.configuration_by_xml_annotation;

import by.makei.spring.spring_introduction.configuration_by_xml_annotation.bean.Cat;
import by.makei.spring.spring_introduction.configuration_by_xml_annotation.bean.Pet;

public class TestClassicCreateBean {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.say();
    }
}
