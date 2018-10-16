package com.company;

import com.company.Provided.Fruit;
import java.util.EnumMap;

public class Main {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.predictCrimes();

        Solution2 solution2 = new Solution2();
        solution2.throwDice(2,6);
        solution2.throwDice(2,10);
        solution2.throwDice(3,6);
        solution2.throwDice(4,10);

        Solution3 solution3 = new Solution3();
        EnumMap<Fruit, Integer> fruits = new EnumMap<Provided.Fruit, Integer>(Fruit.class);
        fruits.put(Fruit.APPLE, 1);
        fruits.put(Fruit.APRICOT, 5);
        fruits.put(Fruit.BANANA, 2);
        fruits.put(Fruit.ORANGE, 5);
        fruits.put(Fruit.PEAR, 3);
        System.out.println(solution3.fruitSalad(fruits));
    }
}
