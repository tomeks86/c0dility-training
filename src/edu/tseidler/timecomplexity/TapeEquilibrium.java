package edu.tseidler.timecomplexity;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int[] partSums = new int[A.length];
        partSums[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            partSums[i] = partSums[i-1] + A[i];
        }
        int min = Math.abs(2 * A[0] - partSums[A.length - 1]);
        int act;
        for (int i = 1; i < A.length - 1; i++) {
            act = Math.abs(2 * partSums[i] - partSums[A.length - 1]);
            if (act < min) {
                min = act;
            }
        }
        return min;
    }
}
