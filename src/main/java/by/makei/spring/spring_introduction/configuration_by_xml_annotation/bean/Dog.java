package by.makei.spring.spring_introduction.configuration_by_xml_annotation.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Dog implements Pet{
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
  public void say(){
      System.out.println(getName()+": Gav-Gav");
  }

  @PostConstruct
  private void init(){
      System.out.println("Dog init method");
  }

  @PreDestroy
  private void destroy(){
      System.out.println("Dog destroy method");
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
