package edu.tseidler.prefixsums;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class PassingCarsTest {
    private PassingCars passingCars = new PassingCars();

    @Test
    @Parameters
    public void shouldSolveProblem(int[] A, int result) {
        assertEquals(result, passingCars.solve(A));
    }
    public Object[] parametersForShouldSolveProblem() {
        return new Object[] {
                new Object[] {new int[] {0, 1, 0, 1, 1}, 5},
                new Object[] {new int[] {0, 0, 0, 0, 0}, 0},
                new Object[] {new int[] {0, 0, 0, 0, 1}, 4},
                new Object[] {new int[] {0, 1, 0, 0, 0}, 1}
        };
    }
}
