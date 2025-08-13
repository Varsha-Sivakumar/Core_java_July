package Problemsolving;

import java.util.Scanner;

public class reverse_a_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :");
        String a= sc.next();
        StringBuffer sb=new StringBuffer(a);
        System.out.println("the string after reversed : " + sb.reverse());


    }


}
