import java.util.Scanner;

public class ARR_BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array ");
        int n1 = sc.nextInt();
        int[] arr= new int[n1];
        for(int i=0;i< arr.length;i++){ // creating the array
            arr[i]= sc.nextInt();
        }
        int max=arr[0]; // max mein arr of zeo daal diye
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i]; // arr[0] se bda koi v hua to uska value max mein dal diye
            }
        }
        for(int floor=max;floor>0;floor--){ // jo max hai utna talla ka building ka loop laga diye
            for(int i=0;i< arr.length;i++){
                if (arr[i]>=floor){   // 7th floor ie row mein jis jis column ka element hoga wo print * hoga
                    System.out.print("*\t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.println();// ek floor khatam hua to ab next line mein na neeche wale floor ka print hoga

        }

    }
}
