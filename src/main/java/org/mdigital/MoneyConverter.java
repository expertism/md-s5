package org.mdigital;

import java.util.ArrayList;
import java.util.List;

public class MoneyConverter {
    public final int[] COINS = {25, 10, 5, 2, 1};

    public List<Integer> convertToCoins(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }

        List<Integer> result = new ArrayList<>();
        int remaining = amount;

        for (int coin : COINS) {
            while (remaining >= coin) {
                result.add(coin);
                remaining -= coin;
            }
        }
        return result;
    }
}
