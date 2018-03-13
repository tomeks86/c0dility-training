package edu.tseidler.timecomplexity;

public class PermMissingElem {
    public int solution(int[] A) {
        long sum = (long) (A.length + 2) * (A.length + 1) / 2;
        for (int i = 0; i < A.length; i++) {
            sum -= A[i];
        }
        return (int) sum;
    }
}
