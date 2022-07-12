package by.makei.interview.entity;

import java.util.List;

public class IntegerList {
    public List<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }

    private List<Integer> integers;

    public IntegerList(List<Integer> integers) {
        this.integers = integers;
    }

}
