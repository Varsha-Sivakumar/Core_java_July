package Problemsolving;

import javax.swing.*;

public class duplicates_in_array {
    public static void main(String[] args) {
        String arr[]={"blue","red","cyon","purple","lavender","purple","beige"};
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("duplicates found :"+arr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("duplicates not found");
        }
    }
}
