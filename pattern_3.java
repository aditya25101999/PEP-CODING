import java.util.Scanner;
/*
      *
    * *
  * * * ye rha pattern
* * * *

 */
public class pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of lines ");
        int n1 = sc.nextInt();
        for(int i=1;i<=n1;i++){  // pehle line 1 phir line 2 phir line 3 aise krte krte nth line tk jaega loop
            for(int j=1;j<=n1-i;j++){// lets assume n=3 to 1st line pr 2 gap 2nd line pr 1 gap 3rd line pr zero gap
                System.out.print("\t"); // ie (n-i) gap chahiye
            }
            for(int k=1;k<=i;k++){  // for n=3 1st line pr 1 star 2nd pr 2 3rd pr 3 star chahiye
                System.out.print("*\t");
            }
            System.out.println(); // takijb i ka value change ho to line change ho jae
        }

    }
}
