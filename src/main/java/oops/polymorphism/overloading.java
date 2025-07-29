package oops.polymorphism;

public class overloading {
    public void add(int a,int b)
    {
        if(a==b)
        {
            System.out.println("the value of a and b are equal");
        }
        else if(a>b)
        {
            System.out.println("a is greater the b");
        }
        else
        {
            System.out.println("both are not equal");
        }
    }
    public void add(float a,float b)
    {
        float result= a+b;
        System.out.println("the value of both a and b :"+result);
    }

    public static void main(String[] args) {
        overloading oo=new overloading();
        oo.add(12,24);
        oo.add(12.4f,23.4f);
    }
}
