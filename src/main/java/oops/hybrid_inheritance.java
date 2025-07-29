package oops;

import java.util.Scanner;

class department{
    public void things()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the items:");
        String items=scan.next();
    }

}
class price extends department{
    public void cost()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the cost:");
        int cost=scan.nextInt();
    }
}
class bill extends price{
    public void type()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the type of paying");
        String type=scan.next();
    }
}
class customer extends department{
    public void regularcustomer()
    {
        System.out.println("you are a regular customer");
        System.out.println("visit again");
    }
}

public class hybrid_inheritance {
    public static void main(String[] args) {
        customer cc=new customer();
        bill bb=new bill();
        cc.things();
        bb.cost();
        bb.type();
        cc.regularcustomer();

    }
}
