import java.util.Scanner;

public class reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        System.out.print("the reversed number is  : ");
        while(n>0){ // ex number 123 hai
            int rem=n%10; // rem=3 pehle last digit nikal diye pir jakr number ko divide karenge ye dhyan rakhna h
            n=n/10; // ab number ho gya 12
            // pehle
            System.out.print(rem);// ln nhi rakhe taaki sara number el saath dikhe
        }
    }
}
