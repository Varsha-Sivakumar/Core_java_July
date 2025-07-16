package operators;

import java.util.Scanner;

public class increment_decrement {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=scan.nextInt();
        System.out.println("enter the value of b");
        int b= scan.nextInt();
        System.out.println("the value of a++ = " + a++);
        System.out.println("the value of b++  =" + b++);
        System.out.println("the value of a-- =" + --a);
        System.out.println("the value of --b = " + --b);
        System.out.println("the value of a--  =" + a--);
        System.out.println("the value of b-- =  " + b--);
        System.out.println("the value of ++a = " + ++a);
        System.out.println("the value of ++b  = " + ++b);
        System.out.println();


    }
}
