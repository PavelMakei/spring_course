package by.makei.interview.entity;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class FooBar {
    private volatile int n;
    private CyclicBarrier barrier = new CyclicBarrier(2);


    public FooBar(int n) {
        this.n = n;
    }

    public void foo() {
        for (int i = 0; i < n; i++) {
            try {
                barrier.await();
                System.out.print("foo");
            } catch (BrokenBarrierException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public void bar() {
        for (int i = 0; i < n; i++) {
            try {
                barrier.await();
                System.out.print("bar");
            } catch (BrokenBarrierException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}