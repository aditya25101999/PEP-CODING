import java.util.Scanner;
/*
* * * *
* * *
* *
*  ye rha pattern
 */
public class pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of lines ");
        int n1 = sc.nextInt();
        for(int i=1;i<=n1;i++){ // pehle 1st line pr jaega phir 2nd line aise krte krte nth line tk

            for(int j=n1;j>=i;j--){ // hr line mein (n1+1-i) star print krna tha
                System.out.print("* "); // ln nhi use kiye taaki jitna i ho utna star print ho
            }
            System.out.println("");
    }
}}

