package control_stmts;

import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the company name");
        String company_name=scan.next();
        if(company_name.equalsIgnoreCase("zoho"))
        {
            System.out.println("u r working in a IT ");
        }
        else if(company_name.equalsIgnoreCase("amazon"))
        {
            System.out.println("u r working in a multinational company");
        }
        else if(company_name.equalsIgnoreCase("sutherland"))
        {
            System.out.println("u r an BPO employee");
        }
        else
        {
            System.out.println("u r not an employee");
        }
    }
}
