import java.util.Scanner;

public class LCM_HCForGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numberS ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int temp;
        int on1=n1;
        int on2=n2;

         if(n1>n2) { //swap kr diye taaki hamesha n2 bda ho
             temp = n2;
             n2 = n1;
             n1 = temp;

             // ye agar nhi v krte to koi farak nhi pdta kyunki 24%36== 24 aayega. phir agle step
             //mein  36%24 apne aap ho jaega but still hm kr diye
         }

            while (true) {
                int rem = n2 % n1;
                if(rem==0){
                    System.out.println("the hcf of "+on1 +" and "+on2 + "is " + n1);
                    break;
                }
                n2=n1;
                n1=rem;
            }
            int lcm= (on1*on2)/n1; // lcm ka formula hota hai (n1*n2)/hcf or gcd apna hcf n1 hi bna gya hai
        System.out.println("the lcm of "+on1 +" and "+on2 +" is "+lcm);
        }
    }

