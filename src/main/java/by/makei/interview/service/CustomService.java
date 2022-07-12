package by.makei.interview.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CustomService {
    private CustomService() {
    }

    /**
     * Problem 1: "Sorted list squared"
     * You have a sorted list of integers. Create a sorted list with all elements squared. Try to do it without explicitly using .sort() and if possible in O(n).
     **/
    public static List<BigInteger> getSquaredList(List<Integer> integers) {
        BigInteger[] bigIntegers = new BigInteger[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            BigInteger tempBigInteger = new BigInteger(String.valueOf(integers.get(i)));
            bigIntegers[i] = tempBigInteger.multiply(tempBigInteger);
        }
        return new ArrayList<>(Arrays.asList(bigIntegers));
    }

    /**
     * "The quick brown fox jumps over the lazy dog" is an English-language pangram — a sentence that contains all of the letters of the English alphabet.
     * Write a function that verifies that statement is correct in the most efficient way (cpu, memory).
     */
    public static boolean isPangram(String str) {
        byte count = 0;
        byte[] bytesFromString = str.getBytes();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < str.length(); j++) {
                if ((bytesFromString[j] & 223) == i + 65) {
                    count++;
                    break;
                }
            }
            if (count <= i) {
                return false;
            }
        }
        return true;
    }


}
