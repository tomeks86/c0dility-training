package edu.tseidler.countingelements;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        int count = X;
        boolean[] flags = new boolean[X + 1];
        int i = 0;
        while (count > 0 && i < A.length) {
            if (!flags[A[i]]) {
                flags[A[i]] = true;
                count--;
            }
            i++;
        }
        return count > 0 ? -1 : i - 1;
    }
}
