package test;

import java.util.Arrays;

import search.BubbleSortAlgorithum;

public class TestBubbleSort {

    public static void main(String[] args) {
        int[] arr = {12, 14, 3, 1, 9, 8, 20, 11};
        BubbleSortAlgorithum.bubbleSort(arr);
        BubbleSortAlgorithum.bubbleSortImproved(arr);
        BubbleSortAlgorithum.bubbleSortImprovedDescending(arr);
        
    }
}
