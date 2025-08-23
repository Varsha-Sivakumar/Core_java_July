package Problemsolving;
public class max_min {
    public static void main(String[] args) {
        int a[] = {5, 8, 6, 4, 9};
        int max = a[0];
        int min=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];  // update max if current element is greater
            }
        }

        System.out.println("The maximum number in the array is: " + max);
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("the minimum number in the array is :"+ min);
    }
}

