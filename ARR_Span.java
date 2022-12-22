import java.util.Scanner;

public class ARR_Span {
    //  as per the question
    //  span of array == max value - min value of array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of array 1");
        int n1 = sc.nextInt();

        int[] arr= new int[n1];

        for(int i=0;i< arr.length;i++){ // creating the array
            arr[i]= sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" "); // printing the array
        }
        for(int i=0;i< arr.length;i++){ // arr[0] will be the max
            if(arr[0]<arr[i]){
                int temp= arr[0];
                arr[0]=arr[i];
                arr[i]=temp;
            }
        }
        int max= arr[0];
      //  System.out.println(max);
        for(int i= arr.length-1;i>=0;i--){
            if(arr[arr.length-1]>arr[i]){  // arr[0] will be the min
                int temp= arr[arr.length-1];
                arr[arr.length-1]=arr[i];
                arr[i]=temp;
            }
        }
        int min= arr[arr.length-1];
        int span=max-min;
        System.out.println("the difference of max and min element of array is "+span);
    }
}

