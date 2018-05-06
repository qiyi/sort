package org.isouth.sort.insert;

import org.isouth.sort.Sorter;

public class InsertSorter implements Sorter {
    @Override
    public int[] sort(int[] input) {
        if (input.length == 1) {
            return input;
        }
        // 新的有序序列
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (input[j] < input[j - 1]) {
                    int tmp = input[j-1];
                    input[j-1] = input[j];
                    input[j] = tmp;
                    continue;
                }
                break;
            }
        }
        return input;
    }
}
