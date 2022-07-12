package by.makei.interview.entity;


import java.util.concurrent.atomic.AtomicBoolean;

public class FooBar {
    private volatile int n;
    AtomicBoolean isBar = new AtomicBoolean(false);


    public FooBar(int n) {
        this.n = n;
    }
    public FooBar(){}

    public void foo() {
        for (int i = 0; i < n; i++) {
            while (isBar.get()) {
                Thread.yield();
            }
            System.out.print("foo");
            isBar.set(true);
        }
    }

    public void bar() {
        for (int i = 0; i < n; i++) {
            while (!isBar.get()) {
                Thread.yield();
            }
            System.out.print("bar");
            isBar.set(false);
        }
    }

    public void setN(int n) {
        this.n = n;
    }
}