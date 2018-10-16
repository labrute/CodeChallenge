package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution1 {

    private static final String EOL = " \n";

    public String predictCrimes() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            result.append("Crime predicted: ");
            result.append(generateSocial());
            result.append(" Calling: ");
            result.append(generatePhone());
            result.append(EOL);
        }
        System.out.println(result.toString());
        return result.toString();
    }

    // Format : 1-###-555-###
    private String generatePhone() {
        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add(randomStringNumber(3));
        numbers.add("555");
        numbers.add(randomStringNumber(4));
        return String.join("-", numbers);
    }

    // Format : ###-##-####
    private String generateSocial() {
        List<String> numbers = new ArrayList<>();
        numbers.add(randomStringNumber(3));
        numbers.add(randomStringNumber(2));
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
