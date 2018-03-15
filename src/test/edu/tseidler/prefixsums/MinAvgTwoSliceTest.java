package edu.tseidler.prefixsums;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MinAvgTwoSliceTest {
    private MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();

    @Test
    @Parameters
    public void shouldSolveProblem(int[] A, int result) {
        assertEquals(result, minAvgTwoSlice.solve(A));
    }
    public Object[] parametersForShouldSolveProblem() {
        return new Object[] {
                new Object[] {new int[] {4, 2, 2, 5, 1, 5, 8}, 1}
        };
    }
}
