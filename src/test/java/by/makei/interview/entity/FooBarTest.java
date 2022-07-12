package by.makei.interview.entity;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FooBarTest {
    public static FooBar fooBar;
    public static FooBar fooBar2;

    @BeforeAll
    static void setUp() {
        fooBar = new FooBar(1);
        fooBar2 = new FooBar(2);
    }

    @Test
    void fooAndBar1() {
        new Thread(()->{
            fooBar.foo();
        }).start();
        new Thread(()->{
            fooBar.bar();
        }).start();
        try {
            Thread.sleep(1000);
            System.out.println("test 1 finished");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
    @Test
    void fooAndBar2() {
        new Thread(()->{
            fooBar2.foo();
        }).start();
        new Thread(()->{
            fooBar2.bar();
        }).start();
        try {
            Thread.sleep(1000);
            System.out.println("test 2 finished");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}