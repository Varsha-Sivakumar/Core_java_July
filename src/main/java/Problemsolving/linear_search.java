package Problemsolving;

public class linear_search {
    public static void main(String[] args) {
        int a[]={5,8,6,7,3,6,10};
        int search_element=6;
        boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
            if(search_element==a[i])
            {
                System.out.println("element found in the array :"+a[i]);
                flag=true;
                break;
            }
        }
            if(flag==false)
            {
                System.out.println("element not found");
            }
    }
}
