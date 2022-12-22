import java.util.*;
public class Allprimebetween_a_range_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lower range");
        int low= sc.nextInt();
        System.out.println("enter the hogher range");
        int high= sc.nextInt();
        if (low<2)
            System.out.println("not accepted, increase your lower input");
        for (int i=low;i<=high;i++){
            int count=0;
            for(int j=2;j*j<=i;j++){ // 2 se shuru kiye to 1 nhi aayega aur root n tk gye hai to sara cover ho jaega
                if(i%j==0){
                    count++;
                    break;

                }
            }
            if(count<=0){
                System.out.println(i);
            }


        }

    }
}
