package edu.tseidler.arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[(K + i) % A.length] = A[i];
        }
        return B;
    }
}
