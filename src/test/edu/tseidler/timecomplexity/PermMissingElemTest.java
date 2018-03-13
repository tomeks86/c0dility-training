package edu.tseidler.timecomplexity;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class PermMissingElemTest {
    PermMissingElem permMissingElem = new PermMissingElem();

    @Test
    @Parameters
    public void solutionTest(int[] A, int result) {
        assertEquals(result, permMissingElem.solution(A));
    }
    private Object parametersForSolutionTest() {
        return new Object[]{
                new Object[] {new int[] {2, 3, 1, 5}, 4},
                new Object[] {new int[] {2, 3, 1, 5, 6, 8, 7}, 4}
        };}

}
