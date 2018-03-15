package edu.tseidler.prefixsums;

import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuery {
    public int[] solve(String S, int[] P, int[] Q) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('A', 1);
        values.put('C', 2);
        values.put('G', 3);
        values.put('T', 4);
        int[] result = new int[P.length];
        int[][] sums = new int[S.length() + 1][4];
        int i = 1;
        for (char c : S.toCharArray()) {
            for (int j = 0; j < 4; j++) {
                sums[i][j] = sums[i-1][j];
            }
            sums[i][values.get(c) - 1]++;
            i++;
        }
        for (int j = 0; j < P.length; j++) {
            for (int k = 0; k < 4; k++) {
                if (sums[Q[j] + 1][k] - sums[P[j]][k] > 0) {
                    result[j] = k+1;
                    break;
                }
            }
        }
        return result;
    }
}
