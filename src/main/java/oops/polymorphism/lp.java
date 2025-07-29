package oops.polymorphism;

class overriding {
    public void subtract(int a, int b) {
        if (a < b) {
            System.out.println("a is largest");
        } else if (a == b) {
            System.out.println("both are equal");
        } else {
            System.out.println("both are equal");
        }
    }
}
    class  subtract1 extends overriding
    {
        public void subtract(int a,int b)
        {
            int result=a-b;
            System.out.println("the value of reslut is"+result);
        }

    }
public class lp{
    public static void main(String[] args) {
        subtract1 ss=new subtract1();
        ss.subtract (12,24);

        overriding oo=new overriding();
        oo.subtract(67,89);



    }
}
