package Sorts.Selection_sort;

public class Selection_sort implements Sort {

    /**
     * @param arr - Array of int values to be sorted
     * @apiNote This is a selection sort.
     * 
     */
    
    public int sort (int[] arr) { // Complexity O(N^2)
        for (int i = 0; i < arr.length; i++) {
            int minor = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minor]) minor = j;
            change(arr, i, minor);
        }
        return arr;
    }

    private void change (int[] arr, int i, int minor) {
        int aux = arr[i];
        arr[i] = arr[minor];
        arr[minor] = aux;
    }
}