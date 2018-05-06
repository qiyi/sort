package org.isouth.sort.selection;

import org.isouth.sort.Sorter;

public class SelectionSorter implements Sorter {
    @Override
    public int[] sort(int[] input) {
        if (input.length == 1) {
            return input;
        }
        for (int i = 0; i < input.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int tmp = input[minIdx];
                input[minIdx] = input[i];
                input[i] = tmp;
            }
        }
        return input;
    }
}
