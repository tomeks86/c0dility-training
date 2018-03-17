package edu.tseidler.countingelements;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class PermCheckTest {
    PermCheck permCheck = new PermCheck();

    @Test
    @Parameters
    public void solutionTest(int[] A, int result) {
        assertEquals(result, permCheck.solution(A));
    }
    private Object parametersForSolutionTest() {
        return new Object[]{
                new Object[] {new int[] {2, 3, 1, 4}, 1},
                new Object[] {new int[] {2, 3, 1, 5}, 0},
                new Object[] {new int[] {6, 3, 1, 5}, 0},
                new Object[] {new int[] {4, 2, 2, 2}, 0},
                new Object[] {new int[] {1, 4, 1}, 0},
                new Object[] {new int[] {2, 3, 1, 5, 4, 7, 6}, 1}
        };
    }
}
