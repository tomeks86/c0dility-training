package edu.tseidler.sorting;

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public int solve(int[] A) {
        long[] p = new long[A.length];
        long[] m = new long[A.length];
        for (int i = 0; i < A.length; i++) {
            p[i] = (long) i - A[i];
            m[i] = (long) i + A[i];
        }
        Arrays.sort(p);
        Arrays.sort(m);

        int thickness = 0;
        int intersections = 0;
        int i = 0;
        int j = 0;
        while (i < A.length  && j < A.length) {
            if (p[i] <= m[j]) {
                intersections += thickness;
                thickness++;
                i++;
            } else {
                thickness--;
                j++;
            }
            if (intersections > 10_000_000) return -1;
        }
        return intersections;
    }
}