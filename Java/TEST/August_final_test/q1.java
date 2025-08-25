/*Write a Java program to remove duplicate elements from an array and print the unique elements.
Example:

Input: [1, 2, 2, 3, 4, 4, 5]
Output: [1, 2, 3, 4, 5]
---------------------------------------------------------------------------------------- */
import java.util.Arrays;
public class q1 {
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        // Step 1: sort array
       // Arrays.sort(arr);

        // Step 2: remove duplicates in-place
        int j = 0; 
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];  // last element add karna

        // Step 3: print unique elements
        System.out.print("After removing duplicate elements: ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
