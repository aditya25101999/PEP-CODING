import java.util.Scanner;
import java.math.*;
/*
INPUT SPECIAL QUESTION HAI jitna digit ka number hoga 1 se utna digit tk sara
 digit present hona chahiye ex- 4 digit hai to  1234 sb present hna chahiye
 input 1423
 inverse 3124
*/


public class inverse_of_a_number_IMPORTANT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int number = sc.nextInt();
        int position=1;
        int inverse=0;
        while(number>0){
            int digit=number%10;
            number=number/10;
            inverse=  inverse+position*(int) Math.pow(10,digit-1);
            position++;

        }
        System.out.println(inverse);


    }
}
