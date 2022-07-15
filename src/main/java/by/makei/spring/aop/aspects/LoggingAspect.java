package by.makei.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice(){
        System.out.println("Попытка получить книгу (order1)");
    }

    @Before("execution(public void get*())")
    public void beforeGetWildCardAdvice(){
        System.out.println("Попытка получить wildCard (order1)");
    }

    @Before("execution(public void beforeReturnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("Попытка вернуть книгу (order1)");
    }

//    @Before("execution(* *())") //любой модификатор доступа(не указывается), любой тип возвращаемого значения(*), любое имя(*)
//    @Before("execution(* *(*))") //любой модификатор доступа(не указывается), любой тип возвращаемого значения(*), любое имя(*), любой 1!!! параметр(*)
    @Before("execution(* *(*))") //любой модификатор доступа(не указывается), любой тип возвращаемого значения(*), любое имя(*), любое количество любых параметров(..)
    public void WildAdvice(){
        System.out.println("Wild advice (order1)");
    }
}
