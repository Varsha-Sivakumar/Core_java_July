package Problemsolving;

public class sum_of_elements {
    public static void main(String[] args) {
        int a[]={1,8,9,5,7};
        int sum=0;
        /*for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("the sum of elements in an array :" +sum);*/
        //enhanced for loop
        for(int value:a)
        {
            sum=sum+value;
        }
        System.out.println("the sum of elements in an array :"+sum);

    }
}
