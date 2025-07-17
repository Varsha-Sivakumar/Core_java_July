package loops;

import java.util.Scanner;

public class atm_dowhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int attempt=0;
        int maxattempt=3;
        int pin=2425;
        do
        {
            System.out.println("enter the pin");
            int enterpin=scan.nextInt();
            if(enterpin==pin)
            {
                System.out.println("access the card");
                break;
            }
            else {
                System.out.println("incorrect pin");
                attempt ++;
            }
        }while(attempt< maxattempt);


    }
}
