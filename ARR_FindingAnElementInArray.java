import java.util.Scanner;

public class ARR_FindingAnElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of array ");
        int n1 = sc.nextInt();

        int[] arr= new int[n1];

        for(int i=0;i< arr.length;i++){ // creating the array
            arr[i]= sc.nextInt();

        }
        System.out.println("enter the element to be searched in  array ");
        int n2 = sc.nextInt();
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==n2){
                System.out.println("the position of the element is "+i);
                count++;
                break; // jb mil hi gaya toaage search kyun krna waste of time
            }
        }
        if(count==0){
            System.out.println(-1);
        }


    }
}
