package org.isouth.sort.insert;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class InsertSorterTest {
    @Test
    public void testSort() {
        InsertSorter sorter = new InsertSorter();
        int[] input = new int[]{6, 6, 3, 8, 9, 2, 10};
        int[] output = sorter.sort(input);
        int[] expect = new int[]{2, 3, 6, 6, 8, 9, 10};
        assertTrue(Arrays.equals(expect, output));
    }
}
