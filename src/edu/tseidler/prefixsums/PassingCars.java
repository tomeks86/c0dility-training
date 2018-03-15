package edu.tseidler.prefixsums;

public class PassingCars {
    public int solve(int[] A) {
        int result = 0;
        int n = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) n++;
            else if (A[i] == 1) result += n;
            if (result > 1_000_000_000) return -1;
        }
        return result;
    }
}
