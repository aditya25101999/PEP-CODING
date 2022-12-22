import java.util.Scanner;
// PTANHI KYUN GALAT HAI
public class ARRSumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array1 ");
        int n1 = sc.nextInt();
        int[] arr1= new int[n1];
        for(int i=0;i< arr1.length;i++){ // creating the array 1
            arr1[i]= sc.nextInt();  // constrainsts array ka element 0-9 ka hi hoga ie single digit elements
        }
        System.out.println("enter the length of array2 ");
        int n2= sc.nextInt();
        int[] arr2= new int[n2];
        for(int i=0;i< arr2.length;i++){ // creating the array 2
            arr2[i]= sc.nextInt(); //// constrainsts array ka element 0-9 ka hi hoga ie single digit elements
        }
        int[] sum= new int[n1>n2? n1+1 :n2+1]; // n1 bda hua to length n1+1 same for n2 // tertiary operator
        // lenghth ek bda isiliye hai kyunki last digit meinagar carry hua to
        int carry=0;
        int i= arr1.length;
        int j= arr2.length;
        int k= sum.length;
        while (k+1>0){
            int digit=carry;

            if(arr1[i]>0){
                 digit= digit+arr1[i];
            }
            if(arr2[i]>0){
                digit= digit+arr2[i];
            }
            digit=digit%10;
            carry= digit/10;
            i--;
            j--;
            k--;

        }

    }
}
