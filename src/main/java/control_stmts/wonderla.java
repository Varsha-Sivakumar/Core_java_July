package control_stmts;

import java.util.Scanner;

public class wonderla {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the weight");
        int weight=scan.nextInt();
        if(weight>=25)
        {
            System.out.println("eligible to play");
            if(weight==25 || weight<=35)
            {
                System.out.println("u r eligible for water games");
            }
                else if(weight>=36 && weight<=45)
            {
                System.out.println("u r eligible for playing rollercoast");
            }
                else
            {
                System.out.println("u can play all games");
            }
        }
        else{
            System.out.println("u r not eligible to play");

        }

    }
}
