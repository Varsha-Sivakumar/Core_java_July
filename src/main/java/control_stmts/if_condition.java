package control_stmts;

import java.util.Scanner;

public class if_condition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the age");
        int age=scan.nextInt();
        if(age>=25)
        {
            System.out.println("welcome to wonderla");
            System.out.println("thrilling games");
            System.out.println("enter the gender");
            String gender=scan.next();
            if(gender.equalsIgnoreCase("female")||(gender.equalsIgnoreCase("Female")))
            {
                System.out.println("water level is 50m");
            }
            else {
                System.out.println("water level is 100m");
            }
        }
        else{
            System.out.println("thank you");
        }
    }
}
