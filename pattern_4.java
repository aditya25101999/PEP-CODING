import java.util.Scanner;
/*
* * * *
  * * *
    * *
      *
 */
public class pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of lines ");
        int n1 = sc.nextInt();
        for(int i=1;i<=n1;i++){ // pehle line 1 phir line 2 phir line 3 aise krte krte nth line tk jaega
            for(int k=1;k<=i-1;k++){//1st line zero space 2nd line 1 space 3rd line 2 space
                System.out.print("\t");
            }
            for(int j=1;j<=n1+1-i;j++){ // let n=4 1st line 4 star, 2nd line 3 star, 3rd line 2 star,
                System.out.print("*\t");// 4th line 1 star
            }
            System.out.println();

        }
    }
}
