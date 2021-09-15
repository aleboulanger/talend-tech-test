package org.talend.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TriangleSumTest {

    @Test
    public void test1() {
        assertThrows(IllegalArgumentException.class, () -> new TriangleSum().maxSum(null));
    }

    @Test
    public void test2() {
        int[][] triangle = { { 1 } };
        assertEquals(1, new TriangleSum().maxSum(triangle));
    }
    @Test
    public void test3() {
        int[][] triangle = { { 3 }, { 10, 1 }, { 20, 1, 1 } };
        assertEquals(33, new TriangleSum().maxSum(triangle));
    }

    @Test
    public void test4() {
        int[][] triangle = { { 2 }, { 10, 100 }, { 20, 1, 100 } };
        assertEquals(202, new TriangleSum().maxSum(triangle));
    }

    @Test
    public void test5() {
        int[][] triangle = { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } };
        assertEquals(30, new TriangleSum().maxSum(triangle));
    }


    @Test
    public void test6() {
        int[][] triangle = { { 2 }, { 7, 5 }, { 11, 13, 17 }, { 29, 37, 31, 23 }, { 0, 1, 0, 0, 0 } };
        assertEquals(60, new TriangleSum().maxSum(triangle));
    }

    @Test
    public void test7() {
        int[][] triangle = { { 0X7FFFFFFF }, { 0X7FFFFFFF, 0X7FFFFFFF } };
        assertEquals(0X7FFFFFFFL * 2, new TriangleSum().maxSum(triangle));
    }
}
