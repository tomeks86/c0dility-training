package edu.tseidler.arrays;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class OddOccurenciesInArrayTest {
    private OddOccurenciesInArray oddOccurenciesInArray= new OddOccurenciesInArray();

    @Test
    @Parameters
    public void solutionTest(int[] A, int result) {
        assertEquals(result, oddOccurenciesInArray.solution(A));
    }
    private Object parametersForSolutionTest() {
        return new Object[]{
                new Object[]{new int[] {1, 2, 3, 1, 2, 3, 7}, 7},
                new Object[]{new int[] {1, 2, 3, 1, 7, 2, 3}, 7},
                new Object[]{new int[] {1, 2, 3, 7, 8, 1, 2, 3, 7}, 8},
                new Object[]{new int[] {1}, 1},
                new Object[]{new int[] {1, 2, 1}, 2},
                new Object[]{new int[] {1, 1, 2}, 2},
                new Object[]{new int[] {2, 1, 1}, 2}
        };}
}