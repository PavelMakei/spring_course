package by.makei.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class LoggingAspect2 {

    @Pointcut("execution(* by.makei.spring.aop.Library.get*(..))")
    private void anyGetInLibrary(){
    }

    @Pointcut("execution(* by.makei.spring.aop.Library.return*(..))")
    private void anyReturnToLibrary(){
    }

    @Pointcut("anyGetInLibrary() || anyReturnToLibrary()")
    private void anyGetOrReturnMethodsInLibrary(){

    }

//    @Before("anyGetInLibrary()")
//    private void beforeAnyGetInLibrary(){
//        System.out.println("Before anyGetInLibrary");
//    }
//    @Before("anyReturnToLibrary()")
//    private void beforeAnyReturnToLibrary(){
//        System.out.println("Before anyGetInLibrary");
//    }

    @Before("anyGetOrReturnMethodsInLibrary()")
    private void anyGetOrReturnMethodsInLibraryAdvice(JoinPoint joinPoint){
        System.out.println("anyGetOrReturnMethodsInLibrary started (Order2)");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Signature = " + signature);
        System.out.println("Method = " + signature.getMethod());
        System.out.println("Method name = " + signature.getMethod().getName());
        Object[] args = joinPoint.getArgs();// Return method params. They could be checked with Class.class or instance of

    }




}
