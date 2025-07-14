package java;

public class Variables {
    static String name = "varsha";
    int date = 30;

    public static void main(String[] args) {
        int age = 20;
        System.out.println("the value of age:" + age);

        Variables abc = new Variables();
        abc.day();


    }

    public void day() {
        int birth = 35;
        System.out.println("the value of birth is :" + birth);
        System.out.println("the value of date is :" + date);
        System.out.println("the name of the string is :"+name);
    }
}


