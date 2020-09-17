package Sorts.Selection_sort;

import java.util.Arrays;
import java.util.Random;

import Sorts.Sort;

public class Selection_sort_test {
    public static void main(String[] args) {
        int[] arr = generateArray(30);
        
        Sort selection_sort = new Selection_sort();

        int[] sorted_arr = selection_sort.sort(arr);

        System.out.println(Arrays.toString(sorted_arr));
    }

    public static int[] generateArray(int arraySize) {
        int[] arr = new int[arraySize];
        Random generator = new Random();
        for (int i = 0; i < arraySize; i++) {
            arr[i] = generator.nextInt(100);
        }
        return arr;
    }
}