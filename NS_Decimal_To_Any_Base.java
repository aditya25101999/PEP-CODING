import java.util.Scanner;


public class NS_Decimal_To_Any_Base {
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
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number which is in decimal format");
            int n = sc.nextInt();
            int original_n=n;
            System.out.println("enter the base");
            int b = sc.nextInt();
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
           // int converted_number2= (int)converted_number; // type cast diye wapas se int mein
        System.out.println((int)converted_number);
        System.out.println("now by using function");
        System.out.println(DecimalToAnyBase(original_n,b));
        // yahan original n isiliye kyunki main function mein hi last tk n ka value zero ho gya
        // function mein n ka value kuch ho that doesnt matter
        // but main mein zero ho gy tha isiliye dusra value lena pada n ka

        }


    }

