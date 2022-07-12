package by.makei.interview.entity;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FooBarTest {
    public static FooBar fooBar;

    @BeforeAll
    static void setUp() {
        fooBar = new FooBar(2);
    }

    @Test
    void fooAndBar() {
        new Thread(()->{
            fooBar.foo();
        }).start();
        new Thread(()->{
            fooBar.bar();
        }).start();
    }

    @Test
    void bar() {
    }
}