package edu.tseidler.sorting;

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public int solve(int[] A) {
        int intersections = 0;
        Range[] ranges = new Range[A.length];
        for (int i = 0; i < A.length; i++) {
            ranges[i] = new Range(i - A[i], i + A[i]);
        }
        Arrays.sort(ranges);
        int i = 0;
        while (i < A.length - 1) {
            int j = i + 1;
            while (j < A.length) {
                if ((ranges[j].getStart() >= ranges[i].getStart() && ranges[j].getStart() <= ranges[i].getEnd()) ||
                ((ranges[j].getEnd() >= ranges[i].getStart() && ranges[j].getEnd() <= ranges[i].getEnd()))) {
                    intersections++;
                    j++;
                } else {
                    break;
                }
            }
            i++;
        }
        return intersections;
    }
}

class Range implements Comparable<Range> {
    private int start;
    private int end;

    Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public int compareTo(Range o) {
        if (this.start > o.start) return 1;
        else if (this.start < o.start) return -1;
        else return (o.end > this.end) ? 1 : -1;
    }
}