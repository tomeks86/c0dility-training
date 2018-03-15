package edu.tseidler.prefixsums;

public class MinAvgTwoSlice {
    public int solve(int[] A) {
        int pos = 0;
        double min = 10_000;
        int[] sums = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            sums[i + 1] = sums[i] + A[i];
        }
        int k = 2;
        double avg;
        while (k < 4) {
            for (int i = 0; i < A.length - k + 1; i++) {
                avg = (double) (sums[i + k] - sums[i]) / k;
                if (avg < min) {
                    min = avg;
                    pos = i;
                }
            }
            k++;
        }
        return pos;
    }
}
