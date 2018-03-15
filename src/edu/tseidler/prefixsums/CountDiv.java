package edu.tseidler.prefixsums;

public class CountDiv {
    public int solution(int A, int B, int K) {
        int result = (B - A) / K;
        if (A % K == 0 || B % K == 0 || A % K > B % K) result++;
        return result;
    }
}
