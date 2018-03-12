package edu.tseidler.iterations;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class BinaryGapTest {
    private BinaryGap binaryGap = new BinaryGap();

    @Test
    @Parameters
    public void solutionTest(int N, int result) {
        assertEquals(result, binaryGap.solution(N));
    }
    private Object parametersForSolutionTest() {
        return new Object[]{
                new Object[]{9, 2},
                new Object[]{529, 4},
                new Object[]{15, 0},
                new Object[]{1041, 5},
                new Object[]{51712, 2 }
        };}

}