package by.makei.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAroundAspect {

    @Pointcut("execution(* by.makei.spring.aop.Library.add*())")
    private void aroundAddBook(){
    }

    @Around(value = "aroundAddBook()")
    private Object aroundAddBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around Before add book advice");
        Object obj = null;
        try {
            obj = proceedingJoinPoint.proceed();
        }catch (Exception e){
            System.out.println("Было залогировано исключение "+ e);
            throw e;
        }
        proceedingJoinPoint.getArgs();
        System.out.println("Around After add book advice");
        return obj;
    }

}
