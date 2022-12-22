import java.util.Scanner;

public class Rotate_a_number_by_kth_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int number=n; // kyunki jb length nikal rhe the to n zero jata hai na
        System.out.println("enter the element by which it should be rotated");
        int k= sc.nextInt();

        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        int len=count;
        k=k%len; // taaki agar 5 digit ka number hai aur 6 baar rotatekrna hua mtlb 1 baar rotate krna hua
        if (k<0){
            k=len+k; // -1 mtlb 4 baar rotate kro
        }
       // System.out.println(len);

         // METHOD 1
        int rotated_number=0;
        for(int i=0;i<k;i++){
            int rem= number%10; //last digit nikla ab wo multily hoga certain 10 ka power something se
            number=number/10;   // jo digit nikal gya usko hta diye
            rotated_number=rotated_number+rem*(int) Math.pow(10,k+i+1);
            //System.out.println("rem is"+rem); // clarity k liye print kr rhe hai taaki pta lage hr step mein rem kya aa rha hai
           // System.out.println(rotated_number);

        }
        rotated_number=rotated_number+number; // plus umber isiliye kiye kyunki jo number rotate hone se bacha gaya hoga wo add ho jaega
        System.out.println(rotated_number);
    }
}
