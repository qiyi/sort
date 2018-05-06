package org.isouth.sort.insert;

import org.isouth.sort.Sorter;

public class InsertSorter implements Sorter {
    @Override
    public int[] sort(int[] input) {
        if (input.length == 1) {
            return input;
        }
        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int idx = i - 1;
            while (idx >= 0 && input[idx] > key) {
                input[idx + 1] = input[idx];
                idx--;
            }
            input[idx+1] = key;
        }
        return input;
    }
}
