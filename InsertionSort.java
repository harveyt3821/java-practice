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
        if (array.length < 3) {
            if (array[1] < array[0]){
                var temp = array[0];
                array[0] = array[1];
                array[1] = temp;
            }
            return array;
        }


        for (int i = 2; i < array.length; i++) {
            var key = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if ( array[j] < key ) continue;

                
            }
        }

        return array;
    }
}
