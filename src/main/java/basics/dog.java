package basics;

public class dog {
    static int a=24; //static variable
    String s="sara"; //instance variable

    public void show()
    {
        int v=54; //local variable
        System.out.println(v);
        System.out.println(a);
        System.out.println(s);

    }

    public static void main(String[] args) {
        int b=25;//global variable
        System.out.println(b);
        dog d1=new dog();
        d1.show();
    }
}
