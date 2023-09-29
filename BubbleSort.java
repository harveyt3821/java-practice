package com.bootcamp.java.sorting;

/*
    Write a function that takes in an array of integers and returns a sorted version of that array.
    Use the Bubble Sort algorithm to sort the array.

    Sample Input:
        array = [8, 5, 2, 9, 5, 6, 3]
    Sample Output:
        [2, 3, 5, 5, 6, 8, 9]
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    var temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
