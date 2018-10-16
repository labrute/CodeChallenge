package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution1 {

    private static final String EOL = "\n";

    public String predicateCrimes() {
        StringBuilder result = new StringBuilder();
        result.append("Crime predicted: ");
        result.append(generatePhone()) ;
        result.append(EOL);
        result.append("Calling: ");
        result.append(generateSocial());
        System.out.println(result.toString());
        result.append(EOL);
        return result.toString();
    }

    private String generatePhone() {
        List<String> numbers = new ArrayList<>();
        numbers.add(randomStringNumber(3));
        numbers.add("555");
        numbers.add(randomStringNumber(4));
        return String.join("-", numbers);
    }

    private String generateSocial() {
        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add(randomStringNumber(2));
        numbers.add(randomStringNumber(3));
        numbers.add(randomStringNumber(4));
        return String.join("-", numbers);
    }

    /**
     * @param size number of digit
     * @return random number to string format
     */
    private String randomStringNumber(int size) {
        StringBuilder result = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            int number = rand.nextInt(10);
            result.append(Integer.toString(number));
        }
        return result.toString();
    }
}
