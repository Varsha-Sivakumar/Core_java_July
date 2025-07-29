package oops;

import java.util.Scanner;

class management{
    public void ceo()
    {
        System.out.println(" CEO OF TCE");
    }
}
class principal extends management{
    public void prince()
    {
        int age=45;
        int salary=45000;
        System.out.println("the age is" +age);
        System.out.println("the salary is" +salary);
    }
}
class teacher extends principal{
    public void students()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the fees structure");
        int a=scan.nextInt();
        System.out.println("enter the course name");
        String b=scan.next();

    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        teacher tt=new teacher();
        tt.ceo();
        tt.prince();
        tt.students();

    }
}
