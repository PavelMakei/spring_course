package by.makei.spring.aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook(){
        System.out.println("Взять книгу");
    }

    public void getMagazine(){
        System.out.println("Взять журнал");
    }

    public String returnMagazine(){
        System.out.println("Вернуть журнал");
        return "Ок";
    }

}
