import java.util.Scanner;

public class NS_AnyBaseToDecimal {
    public static int AnyBaseToDecimalConversion(int n, int b){
        int decimal_number=0;
        int power=1;
        while(n>0) {
            int rem = n % 10; // jisme convert krna hota hai uske base se divide krte hai
            n = n / 10;       // yahan decimal mein convert ho rha hai to base 10 se hai isliye 10se divide hua
            decimal_number = decimal_number + rem * power;
            power = power * b; // jissey convert ho rha hota hai uske base se multiply krte hai
        }


        return decimal_number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
      //  int original_n=n;
        System.out.println("enter the base of the entered number");
        int b = sc.nextInt();
        System.out.println(AnyBaseToDecimalConversion(n,b));
    }
}
