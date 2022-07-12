package by.makei.interview.service;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

class CustomServiceTest {
    private static final String correctString = "The quick brown fox jumps over the lazy dog";
    private static final String inCorrectString = "The quicc brown fox jumps over the lazy dog";
    public static List<Integer> integers;


    @BeforeAll
    public static void setUp() {
        integers = new ArrayList<>();
        for (int i = -100; i < 100; i++) {
            integers.add(i);
        }
    }

    @Test
    void getSquaredList1() {
        List<Integer> actual = CustomService.getSquaredList(integers);
        Assertions.assertTrue(actual.size() == integers.size());
    }

    @Test
    void isPangram() {
        Assertions.assertTrue(CustomService.isPangram(correctString));
        Assertions.assertFalse(CustomService.isPangram(inCorrectString));
    }
}