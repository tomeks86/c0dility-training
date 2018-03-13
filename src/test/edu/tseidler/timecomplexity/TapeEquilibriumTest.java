package edu.tseidler.timecomplexity;

import edu.tseidler.iterations.BinaryGap;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TapeEquilibriumTest {
    private TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    @Parameters
    public void solutionTest(int[] A, int result) {
        assertEquals(result, tapeEquilibrium.solution(A));
    }
    private Object parametersForSolutionTest() {
        return new Object[]{
                new Object[] {new int[] {3, 1, 2, 4, 3}, 1}
        };}
}
