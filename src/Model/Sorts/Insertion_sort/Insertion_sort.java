package Sorts.Insertion_sort;

import Sorts.Sort;

public class Insertion_sort implements Sort {

    /**
     * @param array - Array of double values to be sorted
     * @see Sort
     * @apiNote This is a insertion sort.
     * The intention of this sorting algorithm is to
     * iterate on each index of a given list
     * where the first iterated index is the newly inserted
     * item. such as a hand of cards when you draw a new card.
     * We then, store the value of the current index.
     * and iterate on each and every previous sorted indexes.
     * if the previous index we are current checking is smaller
     * than the current inserted index, we swap every index to the next.
     * and finally place the current index on its correct place.
     */
    public double[] sort(double[] array) {
        int array_length = array.length;

        for(int i = 1; i < array_length; i++) {
            double current = array[i];
            int previous = i - 1;

            while((previous > -1) && array[previous] > current) {
                array[previous + 1] = array[previous];
                previous--;
            }
            array[previous + 1] = current;
        }

        return array;
    }
}
