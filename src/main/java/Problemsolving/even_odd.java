package Problemsolving;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int a= sc.nextInt();
        int even_count=0;
        int odd_count=0;
        while(a>0)
        {
            int rem=a%10;
            if (rem % 2 == 0)
            {
                even_count++;
                System.out.println("the number is even");
            }
            else {
                odd_count++;
                System.out.println("the number is odd");
            }
        }
    }
}
