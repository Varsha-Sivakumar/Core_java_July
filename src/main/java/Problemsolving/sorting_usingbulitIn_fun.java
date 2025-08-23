package Problemsolving;

import java.util.Arrays;

public class sorting_usingbulitIn_fun {
    public static void main(String[] args) {
        int a[]={1,8,6,2,7,6};
        System.out.println("arrays before sorting:"+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("arrays after sorting:"+ Arrays.toString(a));
    }
}
