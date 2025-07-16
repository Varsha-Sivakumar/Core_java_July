package operators;

import java.util.Scanner;

public class arithematic {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a= scan.nextInt();
        System.out.println("enter the value of b");
        int b= scan.nextInt();
        int result= a+b;
        System.out.println("the result is" + result);

    }
}
