package Problemsolving;

import java.util.Arrays;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int a[] = {5, 8, 6, 3, 1, 4, 7};
        System.out.println("Array before sorting: " + Arrays.toString(a));

        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            // Print after each pass (optional)
            System.out.println("After pass " + (i+1) + ": " + Arrays.toString(a));
            break;
        }

        System.out.println("Array after sorting: " + Arrays.toString(a));
    }
}

