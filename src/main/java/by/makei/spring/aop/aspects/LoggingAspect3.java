package by.makei.spring.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect3 {

    @Pointcut("execution(* by.makei.spring.aop.Library.return*(..))")
    private void anyReturnToLibraryAfter(){
    }

    @AfterReturning(value = "anyReturnToLibraryAfter()",returning = "returnString")// при нормальном завершении метода. Можно получить и изменить выходны данные метода
    private void afterReturningAdvice(String returnString){
        System.out.println("After return advice. String = " + returnString);
    }

    @AfterThrowing(value = "anyReturnToLibraryAfter()", throwing = "exception")//
    private void afterThrowingAdvice(Throwable exception){
        System.out.println("AfterThrowing return advice. Exception = " + exception);
    }

    @After(value = "anyReturnToLibraryAfter()")
    private void afterReturnAdvice(){
        System.out.println("After return any result advice");
    }


}
