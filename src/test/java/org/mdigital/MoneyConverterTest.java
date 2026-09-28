package org.mdigital;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoneyConverterTest {
    MoneyConverter m = new MoneyConverter();
    @Test
    void testExampleAmount46() {
        List<Integer> expected = List.of(25, 10, 10, 1);
        assertEquals(expected, m.convertToCoins(46));
    }

    @Test
    void testExactCoinMatch() {
        List<Integer> expected = List.of(25);
        assertEquals(expected, m.convertToCoins(25));
    }

    @Test
    void testMultipleSmallCoins() {

        List<Integer> expected = List.of(5, 2, 2);
        assertEquals(expected, m.convertToCoins(9));
    }

    @Test
    void testZeroAmount() {
        assertTrue(m.convertToCoins(0).isEmpty());
    }

    @Test
    void testNegativeAmountThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> m.convertToCoins(-10));
    }

}
