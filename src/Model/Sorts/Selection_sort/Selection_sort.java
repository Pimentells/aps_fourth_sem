package Sorts.Selection_sort;

import Sorts.Sort;

public class Selection_sort implements Sort {

    /**
     * @param array - Array of int values to be sorted
     * @see Sort
     * @apiNote This is a selection sort.
     * this sorting algorithm intends to iterate on each index of a given list
     * where it tries to find the smallest value and put in smallest index available on the list.
     * The algorithm keeps doing the same until it has no more positions available
     */
    
    public double[] sort (double[] array) { // Complexity O(N^2)
        for (int i = 0; i < array.length; i++) {
            int minor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minor])
                    minor = j;
            }
            change(array, i, minor);
        }
        return array;
    }


    private void change (double[] array, int i, int minor) {
        double aux = array[i];
        array[i] = array[minor];
        array[minor] = aux;
    }
}
