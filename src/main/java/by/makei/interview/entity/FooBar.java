package by.makei.interview.entity;


import java.util.concurrent.CountDownLatch;
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
//
//public class FooBar {
//    private final CountDownLatch finish;
//    private final int n;
//    AtomicBoolean isBar = new AtomicBoolean(false);
//
//
//    public FooBar(int n, CountDownLatch finish) {
//        this.n = n;
//        this.finish = finish;
//    }
//    public void foo() {
//        for (int i = 0; i < n; i++) {
//            while (isBar.get()) {
//                Thread.yield();
//            }
//            System.out.print("foo");
//            isBar.set(true);
//        }
//    }
//
//    public void bar() {
//        for (int i = 0; i < n; i++) {
//            while (!isBar.get()) {
//                Thread.yield();
//            }
//            System.out.print("bar");
//            isBar.set(false);
//        }
//        finish.countDown();
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        CountDownLatch finish = new CountDownLatch(1);
//        final FooBar bar = new FooBar(100, finish);
//        new Thread(bar::bar).start();
//        new Thread(bar::foo).start();
//        finish.await();
//    }
//}