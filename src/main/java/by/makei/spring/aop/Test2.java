package by.makei.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        Library library = context.getBean("libraryBean", Library.class);

        library.addBook();

        context.close();//TODO!!!!!!!!!!! как не забыть?!
    }
}
