package edu.tseidler.countingelements;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FrogRiverOneTest {
    private FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    @Parameters
    public void solutionTest(int X, int[] A,int result) {
        assertEquals(result, frogRiverOne.solution(X, A));
    }
    private Object parametersForSolutionTest() {
        return new Object[]{
                new Object[] {5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}, 6},
                new Object[] {7, new int[] {1, 3, 1, 4, 2, 3, 5, 4, 5}, -1}
        };}
}
