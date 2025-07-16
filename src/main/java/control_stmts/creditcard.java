package control_stmts;

import java.util.Scanner;

public class creditcard {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the cibil score");
        int cibil=scan.nextInt();
        if(cibil>=100 && cibil<=200)
        {
            System.out.println("you are eligible for loan amount upto 1 lakh");
        }
        else if(cibil>=201 && cibil<=400)
        {
            System.out.println("you are eligible for loan amount upto 2.5 lakhs ");
        }
        else if (cibil >= 750)
        {
            System.out.println("you are eligible for loan amount upto 5 lakhs");
        }
        else
        {
            System.out.println("you cant have a credit card");
        }
    }
}
