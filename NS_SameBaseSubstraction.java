import java.util.Scanner;
// GALTI SAMAJH NHI AA RHA HAI
public class NS_SameBaseSubstraction {
    public static int substraction(int n1, int n2, int b){
        int Difference=0;
        int power=1;
        if (n2>n1){  //ab hamesha n1 bda hoga
            int temp=0;
            temp=n1;
            n1=n2;
            n2=temp;
        }
        while(n1>0){
            int rem1=n1&10;
            int rem2=n2&10;
            if(rem1<rem2){
                rem1=rem1+b;
                n1=n1-10;

            }
            int rem3= rem1-rem2;
            Difference=Difference+ rem3*power;
          //  System.out.println(Difference);
            power=power*10;
            n1=n1/10;
            n2=n2/10;

        }
        return Difference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number 1");
        int n1 = sc.nextInt();
        System.out.println("enter the number 2");
        int n2 = sc.nextInt();

        System.out.println("enter the base");
        int b = sc.nextInt();
        System.out.println(substraction(n1,n2,b));
    }
}
