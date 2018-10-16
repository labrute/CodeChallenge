package com.company;

import java.math.BigDecimal;

public class Solution2 {

    public BigDecimal throwDice(int D, int F) {
        // probability to not have a 6 by faces
        double fraction = ((F - 1.0) / F);
        // 100 % - probability to not have a 6 by dices
        double result = 1.0 - Math.pow(fraction, D);
        System.out.println(new BigDecimal(result).setScale(5, BigDecimal.ROUND_HALF_UP));
        // convert + round
        return new BigDecimal(result).setScale(5, BigDecimal.ROUND_HALF_UP);
    }
}
