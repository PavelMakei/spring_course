package by.makei.interview.service;

import java.util.LinkedList;
import java.util.List;

public final class CustomService {
    public static final Integer MAX_POSSIBLE_VALUE = 46_340;

    private CustomService() {
    }

    /**
     * Problem 1: "Sorted list squared"
     * You have a sorted list of integers. Create a sorted list with all elements squared. Try to do it without explicitly using .sort() and if possible in O(n).
     **/
    public static List<Integer> getSquaredList(List<Integer> integers) {
        LinkedList<Integer> list = new LinkedList<>();
        int currentSqrtInt;
        for (Integer integer : integers) {
            if (Math.abs(integer) > MAX_POSSIBLE_VALUE) {
                System.out.println("Too big value");
                throw new RuntimeException();
            }
            currentSqrtInt = integer * integer;
            if (list.isEmpty()) {
                list.add(currentSqrtInt);
            } else {
                if (list.getLast() <= currentSqrtInt) {
                    list.add(currentSqrtInt);
                } else if (list.getFirst() >= currentSqrtInt) {
                        list.add(0,currentSqrtInt);
                    }else {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) >= currentSqrtInt) {
                            list.add(i, currentSqrtInt);
                            break;
                        }
                    }
                }
            }
        }

        return list;
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
