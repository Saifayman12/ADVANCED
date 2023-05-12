package task5;

public class HeapSort {
    public static void heapSort(int[] arr1) {
        int a = arr1.length;

        // Build a min heap by heapifying all non-leaf nodes
        for (int i = a / 2 - 1; i >= 0; i--)
            heapify_sort(arr1, a, i);

        // Extract the minimum element from the heap one-by-one, and append to the sorted list
        for (int i = a - 1; i >= 0; i--) {
            // Swap the root node with the last element
            int temporary = arr1[0];
            arr1[0] = arr1[i];
            arr1[i] = temporary;

            // Heapify the remaining elements to restore the min heap property
            heapify_sort(arr1, i, 0);
        }
    }

    private static void heapify_sort(int[] arr1, int n, int i) {
        int smallest_num = i;
        int L = 2 * i + 1;
        int R = 2 * i + 2;

        // Find the smallest_num number among the root node and its children
        if (L < n && arr1[L] < arr1[smallest_num])
            smallest_num = L;
        if (R < n && arr1[R] < arr1[smallest_num])
            smallest_num = R;

        // If the root node is not the smallest_num, change it with the smallest_num child using the temperory variable
        if (smallest_num != i) {
            int temp = arr1[i];
            arr1[i] = arr1[smallest_num];
            arr1[smallest_num] = temp;
            heapify_sort(arr1, n, smallest_num);
        }
    }
    
 // this function is to print the arrays instead of making for loops for the array 
    //once before sorting and once after to display the as an output

    public static void display(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = { 4,6,1,3,6,78,2,10,5 };
        
        System.out.println("original array:");
        display(arr1);

        HeapSort.heapSort(arr1);

        System.out.println("\n heap Sorted array:");
        display(arr1);
    }
}
