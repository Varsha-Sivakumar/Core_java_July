package Problemsolving;

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        System.out.println("enter the third number:");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+"is largest");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+"is largest");
        }
        else
        {
            System.out.println(c+"is largest");
        }
    }
}