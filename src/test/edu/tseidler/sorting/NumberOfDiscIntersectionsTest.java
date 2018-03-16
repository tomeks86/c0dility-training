package edu.tseidler.sorting;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class NumberOfDiscIntersectionsTest {
    private NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();

    @Test
    @Parameters
    public void shouldSolveProblem(int[] A, int result) {
        assertEquals(result, numberOfDiscIntersections.solve(A));
    }
    public Object[] parametersForShouldSolveProblem() {
        return new Object[] {
                new Object[] {new int[] {1, 5, 2, 1, 4, 0}, 11},
                new Object[] {new int[] {0, 0, 0, 0, 0, 0}, 0},
                new Object[] {new int[] {}, 0},
                new Object[] {new int[] {1, 0, 0, 3}, 4}
        };
    }
}
