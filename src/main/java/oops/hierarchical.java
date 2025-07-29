package oops;

import java.util.Scanner;

class college{
    public  void course()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of course provided");
        int course= scan.nextInt();
        System.out.println("enter the course name");
        String name= scan.next();
    }
}
class fee_structure extends college{
    public void amount()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the fees");
        int amount =scan.nextInt();
    }
}
class facilities extends college{
    public void available()
    {
        System.out.println("wi_fi");
        System.out.println("AC");
    }
}

public class hierarchical {
    public static void main(String[] args) {
        facilities ff=new facilities();
        ff.course();
        fee_structure fs=new fee_structure();
        fs.amount();
        ff.available();



    }
}
