import java.sql.SQLOutput;
import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of terms you want to print");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int c=a+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(b);


        for(int i=0;i<n-3;i++) {

            a=b;
            b=c;
            c=a+b;
            System.out.println(c);
        }
/// method 2 or better method isko yaaad hi krlo
        System.out.println("method 2");
        int x=0;
        int y=1;
        for(int i=0;i<n;i++){
            System.out.println(x);
            int z=x+y;
            x=y;
            y=z;

        }



    }
}