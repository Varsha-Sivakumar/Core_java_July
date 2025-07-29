package oops;
class add{
    public void sum()
    {
        int a=12;
        int b=15;
        int result=a+b;
        System.out.println("the result is "+result);
    }
}
class sub extends add{
    public void subtract()
    {
        int a=12;
        int b=15;
        int result=a-b;
        System.out.println("the result is "+result);

    }
}

public class single_inheritance {
    public static void main(String[] args) {
        add aa=new add();
        aa.sum();
        sub bb=new sub();
        bb.subtract();
        bb.sum();


            }
        }


