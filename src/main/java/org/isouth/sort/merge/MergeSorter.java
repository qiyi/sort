package org.isouth.sort.merge;

import org.isouth.sort.Sorter;

public class MergeSorter implements Sorter {
    @Override
    public int[] sort(int[] input) {
        if (input.length == 1) {
            return input;
        }
        if (input.length == 2) {
            if (input[0] > input[1]) {
                int tmp = input[1];
                input[1] = input[0];
                input[0] = tmp;
            }
            return input;
        }
        // 分成两部分
        int size = input.length / 2;
        int[] a = new int[size];
        int[] b = new int[input.length - size];
        System.arraycopy(input, 0, a, 0, a.length);
        System.arraycopy(input, size, b, 0, b.length);
        int[] sa = sort(a);
        int[] sb = sort(b);

        int[] output = new int[input.length];
        // 合并两个有序数组
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < output.length) {
            if (j == sa.length) {
                // 把 b 都复制过来
                System.arraycopy(sb, k, output, i, sb.length - k);
                i = i + sb.length - k;
                k = sb.length;
            } else if (k == sb.length) {
                // 把 a 都复制过来
                System.arraycopy(sa, j, output, i, sa.length - j);
                i = i + sa.length - j;
                j = sa.length;
            } else if (sa[j] < sb[k]) {
                output[i++] = sa[j++];
            } else {
                output[i++] = sb[k++];
            }
        }
        return output;
    }
}
