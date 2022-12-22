import java.util.Scanner;

public class prime_factorisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n1 = sc.nextInt();
        int on1=n1;
        for (int i=2;i<=on1/2;i++){ // on1 isiliye kiye kyunki n1 tha towo v change hote ja rha tha na
            while( n1%i==0){
                int quotient=n1/i;
                System.out.print(i+" "); // agar 2 se kata to ek baar 2 print ho jaega
                n1=quotient;        // an n1 chota hota gya to jb tk katega tb tk i print hota jaega
                                    // jn nhi katega to i ka vlaue next integer ho jaega
                }
            }
        }
    }

