package edu.tseidler.prefixsums;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;

@RunWith(JUnitParamsRunner.class)
public class GenomicRangeQueryTest {
    private GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

    @Test
    @Parameters
    public void shouldSolveProblem(String S, int[] P, int[] Q, int[] result) {
        assertArrayEquals(result, genomicRangeQuery.solve(S, P, Q));
    }
    public Object[] parametersForShouldSolveProblem() {
        return new Object[] {
                new Object[] {"CAGCCTA", new int[] {2, 5, 0, 6}, new int[] {4, 5, 6, 6}, new int[] {2, 4, 1, 1}},
                new Object[] {"CCCCCCCC", new int[] {2, 5, 0}, new int[] {4, 5, 6}, new int[] {2, 2, 2}},
                new Object[] {"GCCCCCCC", new int[] {2, 5, 0}, new int[] {4, 5, 6}, new int[] {2, 2, 2}}
        };
    }
}
