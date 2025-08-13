package Problemsolving;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int a=sc.nextInt();
        int org_num=a;
        int rev=0;
        while(a!=0)
        {
            rev=rev*10+a%10;
            a=a/10;
        }
        if(org_num==rev)
        {
            System.out.println("the number is palindrome "+org_num);
        }
        else {
            System.out.println("the number is not a palindrome "+org_num);
        }
    }
}
