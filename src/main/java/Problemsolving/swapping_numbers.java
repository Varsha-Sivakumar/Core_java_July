package Problemsolving;

import java.util.Scanner;

public class swapping_numbers {
    public static void main(String[] args) {
        /*int a=25;
        int b=70;
        System.out.println("the numbers before swapping :"+a+" "+b);
        int t1=a;
        a=b;
        b=t1;
        System.out.println("the numbers after swapping :"+a+" "+b);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a=sc.nextInt();
        System.out.println("enter the value of b :");
        int b=sc.nextInt();
        System.out.println("the numbers before swapping:" +a+ " " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the numbers after swapping:" +a+ " " +b);
    }
}
