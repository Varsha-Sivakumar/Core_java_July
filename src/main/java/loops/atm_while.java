package loops;

import java.util.Scanner;

public class atm_while {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int attempt=0;
        int maxattempt=4;
        int pin=2004;
        while (attempt < maxattempt) {
            System.out.println("enter the 4 digit pin");
            int enterpin = scan.nextInt();
            if (enterpin == pin) {
                System.out.println("access the card");
                break;
            } else {
                System.out.println("incorrect pin");
                attempt++;

            }

            if (attempt >= maxattempt) {
                System.out.println("you reached maxattempt");
            }
            else
            {
                System.out.println("your card is blocked");
            }
        }
    }
}
