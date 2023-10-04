package com.bootcamp.java.sorting;

/*
    Write a function that takes in an array of integers and returns a sorted version of that array.
    Use the Selection Sort algorithm to sort the array.

    Sample Input:
        array = [8, 5, 2, 9, 5, 6, 3]
    Sample Output:
        [2, 3, 5, 5, 6, 8, 9]
 */
public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;
            // Select the minimum element in each loop.
            for (int i = step + 1; i < size; i++) {
                if (array[i] < array[min_idx]) {
                    min_idx = i;
                }
            }

            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }

        return array;
    }
}
