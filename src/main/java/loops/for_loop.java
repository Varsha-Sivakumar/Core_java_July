package loops;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int attempt=0;
        int maxattempt=3;
        int pin=5454;
        for(attempt=0;attempt<=3;attempt++)
        {
            System.out.println("enter the 4 digit pin");
            int enterpin = scan.nextInt();
            if(enterpin==pin)
            {
                System.out.println("you can access the card");
                break;
            }
            else
            {
                System.out.println("incorrect pin");
            }
            if(attempt>=maxattempt)

            {
                System.out.println("you reached the maxattempt");
                break;
            }
            else
            {
                System.out.println("you card is blocked");
            }

        }
    }

    }