package edu.tseidler.iterations;

public class BinaryGap {
    public int solution(int N) {
        int max = 0;
        String binary = Integer.toBinaryString(N);
        int i = 0;
        int curLen;
        while (i < binary.length()) {
            if (binary.charAt(i) == '0') {
                curLen = 1;
                while (++i < binary.length() && binary.charAt(i) == '0') {
                    curLen++;
                }
                if (curLen > max && binary.charAt(Math.min(i, binary.length() - 1)) == '1') {
                    max = curLen;
                }
            }
            i++;
        }
        return max;
    }
}
