package edu.tseidler.countingelements;

import java.util.Set;
import java.util.TreeSet;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        Set<Integer> nums = new TreeSet<>();
        int i = 0;
        while (nums.size() != X && i < A.length) {
            nums.add(A[i]);
            i++;
        }
        return nums.size() == X ? i-1 : -1;
    }
}
