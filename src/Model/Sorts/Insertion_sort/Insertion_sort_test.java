package Sorts.Insertion_sort;

import Sorts.Sort;

public class Insertion_sort_test {
    public static void main(String[] args) {
        double[] test_array = {9,1,32,32.45,30,31.2,31.6,31.1,91,143,14,3,2,43,11,58,22};

        System.out.println("Array Before Sort");
        for (double i : test_array) {
            System.out.print(i + " ");
        }

        System.out.println();

        Sort insertion = new Insertion_sort();
        double[] sorted_aray = insertion.sort(test_array);
        
        System.out.println("Array After Sort");
        for (double i : sorted_aray) {
            System.out.print(i + " ");
        }
    } 
}
