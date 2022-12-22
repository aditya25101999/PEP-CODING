import java.util.Scanner;

public class count_number_of_digits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        // number aagya maan lo 9876543
        int count=0;
        while(n>0){   // number jo v hoga yahan aayega
            n=n/10;     // number mein se ek digit gya ab
            count++;

        }
        System.out.println(count);
    }

}
