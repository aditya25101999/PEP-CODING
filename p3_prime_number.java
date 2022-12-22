import java.util.*;
// N NUMBER KO CHECK KRNA HAI KI WO PRIME HAI KI NI
public class p3_prime_number {
    public static void main(String[] args) {
        System.out.println("enter the number of numbers you want to check");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
       // int arr=a; // pehle hm ek numbers ka array banane ka soch rhe the but then
        // ek loop k andar solve kr rhe pehli aar jo number enter hoga uska checking krk result print
        // kr denge phr next number pr badhega problem solved


        //METHOD 1 FAILS TIME COMPLEXITY PR DIMMAG MEIN THI AAYA THA SABSE PEHLE
        for(int i=1;i<=a;i++){

            int n= sc.nextInt();
            int count=0;
            if(n==1)
                System.out.println("neither prime neithe not prime");
            //for (int j=2;j<n;j++){ YE SHI BS TIME COMPLEXITY JYADA HAI KYUNKI N TK LOOP RUN HO RHA H

            // KOI V NUMBER PRIME HAI YA NHI YE CHECK KRNE K LIYE LOOP KO UNDER ROOT N TK HI RUN KRNA CHAHIYE
            // RULE J*J<= N KARENGE RESULTS JLDI AAYEGA
            for (int j=2;(j*j)<=n;j++){
                if (n%j==0){
                    count++;
                    break;  // VVI AS IT REDUCES THE TIME COMPLEXITY 1 FACTOR MILA TO AAGE CHECK KYUN KRE
                }
            }
            if (count>0)
                System.out.println("not prime");
            else System.out.println("prime");

        }
    }
}

