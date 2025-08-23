package Problemsolving;

public class extract_even_odd {
    public static void main(String[] args) {
        int a[]={2,1,4,5,8,7};
        for(int i=0;i<a.length;i++) //extract even
        {
            if(a[i]%2==0)
                System.out.println(a[i]);
        }
        for(int i=0;i<a.length;i++)   //extract odd

        {
            if(a[i]%2!=0)
                System.out.println(a[i]);
        }

    }
}
