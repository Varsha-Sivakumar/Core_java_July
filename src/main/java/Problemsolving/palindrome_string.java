package Problemsolving;

import java.util.Scanner;

public class palindrome_string {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string : ");
        String str= scan.next();
        String org_str=str;
        String rev="";
        int length=str.length();
        for(int i=length-1;i>=0;i++)
        {
            rev=rev+str.charAt(i);
        }

        if(org_str.equals(rev))
        {
            System.out.println("the string is palindrome :"+org_str);
        }
        else {
            System.out.println("the string is not a palindrome :"+org_str);
        }

    }
}
