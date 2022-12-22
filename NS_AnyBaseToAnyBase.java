import java.util.Scanner;

public class NS_AnyBaseToAnyBase {
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
    public static int DecimalToAnyBase(int n, int b){
        int rem=0;
        double converted_number=0; // math . pow lagane se number double mein convert ho jata h
        int count=0;
        while(n>0){
            rem=n%b;  // jisme convert krna hota hai uske base se divide kro
            n=n/b;    // jisme convert krna hota hai uske base se divide kro
            converted_number= converted_number+ (rem* Math.pow(10,count));
            // jisme number already hai uske base ka power chalega
            // yahan decimal mein tha to base 10 tha isiliye power 10 ka hua
            count++;
        }
        int converted_number2= (int)converted_number;
        return converted_number2;
    }
    public static int AnyBaseToAnyBaseConversion(int n, int b,int b2){
        int decimal_number=AnyBaseToDecimalConversion( n, b);
        // jo number enter kiye with any base wo convert ho gaya decimal mein
        int converted_number=DecimalToAnyBase( decimal_number, b2);
        // iput mein decimal number dale taaki ab wo decimal ko kisi v given base mein convert kr de



        return converted_number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        //  int original_n=n;
        System.out.println("enter the base of the entered number");
        int b = sc.nextInt();
        System.out.println("enter the base of the converted number");
        int b2 = sc.nextInt();
        System.out.println(AnyBaseToAnyBaseConversion(n,b,b2));
    }

    }

