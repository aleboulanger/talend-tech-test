package org.talend.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StocksTest {

    @Test
    public void test0() {
        assertThrows(IllegalArgumentException.class, () -> new Stocks().maxProfit(null));
    }

    @Test
    public void test1() {
        int[] prices = { };
        assertEquals(0, new Stocks().maxProfit(prices));
    }

    @Test
    public void test2() {
        int[] prices = { 1 };
        assertEquals(0, new Stocks().maxProfit(prices));
    }

    @Test
    public void test3() {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        assertEquals(5, new Stocks().maxProfit(prices));
    }

    @Test
    public void test4() {
        int[] prices = { 0, 0, 0, 0, 1000 };
        assertEquals(1000, new Stocks().maxProfit(prices));
    }

    @Test
    public void test5() {
        int[] prices = { 1000, 100, 10, 0 };
        assertEquals(0, new Stocks().maxProfit(prices));
    }

    @Test
    public void test6() {
        int[] prices = { 1, 10, 0, 100 };
        assertEquals(100, new Stocks().maxProfit(prices));
    }

    @Test
    public void test7() {
        int[] prices = new int[100_000];
        prices[100_000 - 1] = 1;
        assertEquals(1, new Stocks().maxProfit(prices));
    }
}
