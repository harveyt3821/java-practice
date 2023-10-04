package com.bootcamp.java.sorting;

/*
    Write a function that takes in an array of integers and returns a sorted version of that array.
    Use the Insertion Sort algorithm to sort the array.

    Sample Input:
        array = [8, 5, 2, 9, 5, 6, 3]
    Sample Output:
        [2, 3, 5, 5, 6, 8, 9]
 */
public class InsertionSort {

    public static int[] insertionSort(int[] array) {
        return insertionSortByLoop(array);
    }

    private static int[] insertionSortByLoop(int[] array) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int left = step - 1;

            while (left >= 0 && key < array[left]) {
                array[left + 1] = array[left];
                --left;
            }

            array[left + 1] = key;
        }

        return array;
    }
}
