package edu.tseidler.arrays;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class CyclicRotationTest {
    private CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    @Parameters
    public void solutionTest(int[] A, int K, int[] result) {
        assertArrayEquals(result, cyclicRotation.solution(A, K));
    }
    private Object parametersForSolutionTest() {
        return new Object[]{
                new Object[]{new int[] {3, 8, 9, 7, 6}, 3, new int[] {9, 7, 6, 3, 8}},
                new Object[]{new int[] {3, 8, 9, 7, 6}, 1, new int[] {6, 3, 8, 9, 7}},
                new Object[]{new int[] {3, 8, 9, 7, 6}, 0, new int[] {3, 8, 9, 7, 6}},
                new Object[]{new int[] {3, 8, 9, 7, 6}, 2, new int[] {7, 6, 3, 8, 9}},
                new Object[]{new int[] {0, 0, 0}, 4, new int[] {0, 0, 0}},
                new Object[]{new int[] {1, 2, 3, 4}, 4, new int[] {1, 2, 3, 4}}
        };}

}