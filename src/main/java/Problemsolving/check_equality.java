package Problemsolving;

public class check_equality {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5};
        int a2[]={5,8,7,6,9,4,};
        boolean status= true;
        if (a1.length==a2.length)
        {
            for(int i=0;i<a1.length;i++)
            {
                if(a1[i]!=a2[i])
                {
                    status=false;
                }
            }
        }
        else {
            status=false;
        }
        if(status==true)
        {
            System.out.println("both the arrays are equal");
        }
        else {
            System.out.println("both the arrays are not equal");
        }
    }
}
