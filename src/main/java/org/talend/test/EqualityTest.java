package org.talend.test;

/**
 * What is the output of this program?
 */
public class EqualityTest {

    static boolean isEqual(Integer x, Integer y) {
        return x == y;
    }

    public static void main(String[] args) {

        if (isEqual(111, 111)) {
            System.out.print("Hello ");
        }
        if (isEqual(222, 222)) {
            System.out.print("world!");
        }
    }
}
