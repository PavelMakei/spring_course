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
        return "This is returning string";
    }

    public String addBook(){
        System.out.println("Добавить книгу");
        try {
            int a = 1/0;
        }catch (ArithmeticException e){
            System.out.println("Catch arithmetic exception in Library");
            throw e;
        }
        return "This is addBookMethod";
    }

}
