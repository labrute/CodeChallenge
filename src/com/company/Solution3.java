package com.company;

import com.company.Provided.Fruit;

import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution3 {
    public int fruitSalad(EnumMap<Fruit, Integer> fruits) {
        int salads = 0;
        // get sorted values
        List<Integer> values = fruits.entrySet().stream().map(Map.Entry::getValue).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(values);
        // count until one of the first 3 items are empty
        while (values.size() >= 3 && values.get(0) > 0 && values.get(1) > 0 && values.get(2) > 0) {
            // increase salads
            salads++;
            // remove current salad
            for (int i = 0; i < 3; i++) {
                values.set(i, values.get(i) - 1);
            }
            // sort again before next check
            values = values.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            System.out.println(values);
        }
        return salads;
    }
}
