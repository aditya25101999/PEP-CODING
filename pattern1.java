import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
         */
        // print this
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of lines ");
        int n1 = sc.nextInt();
        for(int i=1;i<=n1;i++){

            for(int j=1;j<=i;j++){
                System.out.print("* "); // ln nhi use kiye taaki jitna i ho utna star print ho
            }
            System.out.println(""); // isiliye laaye taaki jb i change hi 1 se
            // 2 ya 2 se 3 to new line mein star print ho

        }
    }
}
