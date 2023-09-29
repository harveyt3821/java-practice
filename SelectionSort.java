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
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int swappingIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if ( min > array[j] ){
                    swappingIndex = j;
                    min = array[j];
                }
            }
            int temp = array[i];
            array[i] = min;
            array[swappingIndex] = temp;
        }

        return array;
    }
}
