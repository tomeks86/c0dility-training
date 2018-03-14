package edu.tseidler.countingelements;

import java.util.Set;
import java.util.HashSet;

public class MissingInteger {
    public int solution(int[] A) {
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            nums.add(A[i]);
        }
        int i = 0;
        while (nums.contains(i+1)) {
            i++;
        }
        return ++i;
    }
}
