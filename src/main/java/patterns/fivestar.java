package patterns;

import java.util.Scanner;

public class fivestar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows=scan.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)

            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
