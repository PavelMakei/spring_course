package by.makei.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();
        library.getMagazine();
        library.returnMagazine();
        System.out.println("-------------------");
        library.addBook();

        context.close();//TODO!!!!!!!!!!! как не забыть?!
    }
}
