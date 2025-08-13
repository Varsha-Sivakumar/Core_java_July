package Problemsolving;
import java.util.Scanner;

public class reverse_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        /*int rev=0;
        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("the number after reversing :" +rev);*/
        StringBuffer re;
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();
        System.out.println("the number after reversing :" +rev);


    }
}
