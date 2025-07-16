package control_stmts;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the alphabet");
        String alphabet=scan.next();
        switch(alphabet)
        {
            case "a":
            case"e" :
            case"i":
            case"o":
            case"u":
                System.out.println(alphabet + " is a vowel ");
                break;

            default:
            {
                System.out.println(alphabet + " is not a vowel ");
            }
        }





    }
}
