package edu.tseidler.countingelements;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;

@RunWith(JUnitParamsRunner.class)
public class MaxCountersTest {
    private MaxCounters maxCounters = new MaxCounters();

    @Test
    @Parameters
    public void solutionMaxCounterProblem(int N, int[] A, int[] result) {
        assertArrayEquals(result, maxCounters.solution(5, A));
    }
    public Object[] parametersForSolutionMaxCounterProblem() {
        return new Object[] {
                new Object[] {5, new int[] {3, 4, 4, 6, 1, 4, 4}, new int[] {3, 2, 2, 4, 2}},
                new Object[] {5, new int[] {1, 1, 1, 1, 1, 1, 1}, new int[] {7, 0, 0, 0, 0}}
        };
    }
}
