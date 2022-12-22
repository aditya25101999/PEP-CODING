import java.util.Scanner;

public class print_the_digits_from_left_to_right {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        char[] arr =String.valueOf(n).toCharArray();// interger ko array mein typecast kr diye
        for(int i=0;i< arr.length;i++){// array ko print kr diye
            System.out.println(arr[i]);
        }

    }
}
