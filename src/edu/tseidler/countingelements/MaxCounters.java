package edu.tseidler.countingelements;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        boolean[] changed = new boolean[N];
        int max = 0;
        int currentMax = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                max = currentMax;
                changed = new boolean[N];
                continue;
            }
            if (!changed[A[i] - 1]) {
                result[A[i] - 1] = max + 1;
                changed[A[i] - 1] = true;
            } else {
                result[A[i] - 1]++;
            }
            if (result[A[i] - 1] > currentMax) {
                currentMax++;
            }
        }
        for (int i = 0; i < N; i++) {
            if (!changed[i]) {
                result[i] = max;
            }
        }
        return result;
    }
}
