package edu.tseidler.timecomplexity;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FrogJmpTest {
    private FrogJmp frogJmp = new FrogJmp();

    @Test
    @Parameters
    public void solutionTest(int X, int Y, int D, int result) {
        assertEquals(result, frogJmp.solution(X, Y, D));
    }
    private Object parametersForSolutionTest() {
        return new Object[]{
                new Object[] {10, 85, 30, 3},
                new Object[] {10, 100, 30, 3},
                new Object[] {10, 101, 30, 4}
        };}

}
