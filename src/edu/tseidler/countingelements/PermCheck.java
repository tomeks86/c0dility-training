package edu.tseidler.countingelements;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public int solution(int[] A) {
        long sum = (long) A.length * (A.length + 1) / 2;
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (nums.add(A[i])) {
                sum -= A[i];
            }
        }
        return sum == 0 ? 1 : 0;
    }
}
