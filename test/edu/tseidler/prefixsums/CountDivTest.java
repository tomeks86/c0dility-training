package edu.tseidler.prefixsums;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CountDivTest {
    private CountDiv countDiv = new CountDiv();

    @Test
    @Parameters
    public void shouldSolveProblem(int A, int B, int K, int result) {
        assertEquals(result, countDiv.solution(A, B, K));
    }
    public Object[] parametersForShouldSolveProblem() {
        return new Object[] {
                new Object[] {1, 5, 1, 5},
                new Object[] {11, 345, 17, 20},
                new Object[] {10, 15, 5, 2},
                new Object[] {8, 16, 5, 2}
        };
    }
}
