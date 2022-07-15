package by.makei.spring.spring_introduction.configuration_by_java.bean;

public abstract class AbstractPet {
    private String name;

    abstract public void say();
    protected String getName(){
        return this.name;
    }

}
