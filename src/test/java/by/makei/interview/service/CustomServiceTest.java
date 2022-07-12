package by.makei.interview.service;

import org.junit.jupiter.api.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CustomServiceTest {
    private static final String correctString = "The quick brown fox jumps over the lazy dog";
    private static final String inCorrectString = "The quicc brown fox jumps over the lazy dog";
    public static List<Integer> integers1;
    public static List<Integer> integers2;
    public static List<Integer> integers3;
    public static List<Integer> integers40;
    private static List<BigInteger> bigIntegers;


    @BeforeAll
    public static void setUp() {
        integers1 = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            integers1.add(i);
        }
        integers2 = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            integers2.add(i);
        }
        integers3 = new ArrayList<>();
        for (int i = 0; i < 3000; i++) {
            integers3.add(i);
        }
        integers40 = new ArrayList<>();
        for (int i = 0; i < 40000; i++) {
            integers40.add(i);
        }
    }

    @Test
    @Order(1)
//    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void getSquaredList1() {
        bigIntegers = CustomService.getSquaredList(integers1);
        Assertions.assertTrue(bigIntegers.size() == integers1.size());
    }
    @Test
    @Order(2)
//    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void getSquaredList2() {
        bigIntegers = CustomService.getSquaredList(integers2);
        Assertions.assertTrue(bigIntegers.size() == integers2.size());
    }
    @Test
    @Order(3)
//    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void getSquaredList3() {
        bigIntegers = CustomService.getSquaredList(integers3);
        Assertions.assertTrue(bigIntegers.size() == integers3.size());
    }
    @Test
    @Order(4)
//    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void getSquaredList4() {
        bigIntegers = CustomService.getSquaredList(integers40);
        Assertions.assertTrue(bigIntegers.size() == integers40.size());
    }


    @Test
    void isPangram() {
        Assertions.assertTrue(CustomService.isPangram(correctString));
        Assertions.assertFalse(CustomService.isPangram(inCorrectString));
    }
}