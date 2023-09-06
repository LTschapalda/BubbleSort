package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortExampleTest {

    @Test
    public void testBubbleSort() {
        int[] unsortedArray = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = {1, 2, 5, 5, 6, 9};

        BubbleSortExample.bubbleSort(unsortedArray);
        assertArrayEquals(sortedArray, unsortedArray);
    }

    @Test
    public void testBubbleSortWithEmptyArray() {
        int[] emptyArray = {};
        int[] expectedArray = {};

        BubbleSortExample.bubbleSort(emptyArray);
        assertArrayEquals(expectedArray, emptyArray);
    }

    @Test
    public void testBubbleSortWithSingleElementArray() {
        int[] singleElementArray = {42};
        int[] expectedArray = {42};

        BubbleSortExample.bubbleSort(singleElementArray);
        assertArrayEquals(expectedArray, singleElementArray);
    }
}
