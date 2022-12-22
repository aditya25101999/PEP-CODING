import java.util.Scanner;

public class NS_SameBaseAddition {
    public static int Addition(int n1,int n2,int b){
        int sum=0;
        int power=1;
       // int carry=0;
        while(n1>0 || n2>0){  // jb tk koi ek v zero se bda hai to addition to hote raheaga na
            int rem1=n1%10;
            int rem2=n2%10;
            int rem3= (rem1+rem2)%b; // rem1 plus rem 2 agar base se bda aa rha hai to
            // usko base plus jo bacha uske form mein likhna chahiye like 8 aaya with base 5 to it will be 5+3
            // 3 actual rem bn jaega aur jo 5 hai wo next digit pr  bn kr chala jaega
            int carry=(rem1+rem2)/b; // either zero ya 1 hi hoga hamesha
            sum= sum+ rem3*power;
            power=power*10;
            n1=n1/10+ carry;
            n2=n2/10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number 1");
        int n1 = sc.nextInt();
        System.out.println("enter the number 2");
        int n2 = sc.nextInt();

        System.out.println("enter the base");
        int b = sc.nextInt();
        System.out.println(Addition(n1,n2,b));
    }
}
