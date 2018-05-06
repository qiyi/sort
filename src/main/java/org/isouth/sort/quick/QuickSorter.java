package org.isouth.sort.quick;

import org.isouth.sort.Sorter;

public class QuickSorter implements Sorter {
    @Override
    public int[] sort(int[] input) {
        if (input.length < 1) {
            return input;
        }
        // 做一遍快速排序，然后分成两组，递归排序
        int key = input[0];
        int i = 0, j = input.length - 1;
        for (; i != j; ) {
            while (i != j) {
                if (input[j] < key) {
                    int t1 = input[j];
                    input[j] = input[i];
                    input[i] = t1;
                    break;
                }
                j--;
            }
            while (i != j) {
                if (input[i] > key) {
                    int t2 = input[i];
                    input[i] = input[j];
                    input[j] = t2;
                    break;
                }
                i++;
            }
        }

        int[] a = new int[i];
        int[] b = new int[input.length - i - 1];
        System.arraycopy(input, 0, a, 0, a.length);
        System.arraycopy(input, i + 1, b, 0, b.length);
        int[] sa = sort(a);
        int[] sb = sort(b);
        int[] output = new int[input.length];
        System.arraycopy(sa, 0, output, 0, sa.length);
        output[i] = key;
        System.arraycopy(sb, 0, output, i+1, sb.length);
        return output;
    }
}
