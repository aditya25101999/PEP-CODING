import java.util.Scanner;

public class pythagoras_triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numberS ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1+n2<=n3 || n2+n3<=n1 || n3+n1<=n2){ // || ka matlb " OR"  hota hai
            System.out.println("cant be pythagoras triplets");

        }
// pura ka pura if statement hi nhi likhte to v chalta

        else if((n1*n1)+(n2*n2)==(n3*n3) || (n1*n1)+(n3*n3)==(n2*n2) || (n2*n2)+(n3*n3)==(n1*n1)){

            System.out.println("pythagoras triplet");
        }
        else {
            System.out.println("not a pythagoras triplet");
        }
    }
}
