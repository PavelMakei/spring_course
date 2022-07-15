package by.makei.spring.spring_introduction.configuration_by_java.bean;

import org.springframework.beans.factory.annotation.Value;

//@Component("ownerBean")
public class Owner {
    @Value("${owner.name}")
    private String name;
//    @Autowired
//    @Qualifier("dogBean")
    private AbstractPet pet;

    public Owner() {
    }

    public Owner(AbstractPet pet) {
        this.pet = pet;
    }

    public void askMyPet() {
        System.out.println(name + ": My lovely pet!");
        pet.say();
    }
}
