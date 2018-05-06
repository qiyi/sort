package org.isouth.sort.selection;

import org.isouth.sort.Sorter;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class SelectionSorterTest {
    @Test
    public void testSort() {
        Sorter sorter = new SelectionSorter();
        int[] input = new int[]{6, 6, 3, 8, 9, 2, 10};
        int[] output = sorter.sort(input);
        int[] expect = new int[]{2, 3, 6, 6, 8, 9, 10};
        assertTrue(Arrays.equals(expect, output));
    }
}
