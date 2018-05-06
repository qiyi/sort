package org.isouth.sort.bubble;

import org.isouth.sort.Sorter;

/**
 * 冒泡排序实现
 */
public class BubbleSorter implements Sorter {
    @Override
    public int[] sort(int[] input) {
        if (input.length == 1) {
            return input;
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[i]) {
                    int tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
            }
        }
        return input;
    }
}
