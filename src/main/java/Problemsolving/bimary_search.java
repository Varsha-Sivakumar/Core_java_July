package Problemsolving;

public class bimary_search {
    public static void main(String[] args) {
        int a[]={1,2,8,9,75,82,96};
       boolean flag=false;
        int key=2;
        int l=0;
        int h=a.length-1;
        while(l<=h)
        {
            int m=l+h/2;
            if(a[m]==key)
            {
                System.out.println("element found");
                flag=true;
                break;
            }
            if(a[m]<key)
            {
                l=m+1;
            }
            if(a[m]>key)
            {
                h=m-1;
            }

        }
        if(flag==false)
        {
            System.out.println("element not found");
        }
    }
}
