import java.util.*;

public class p2_grading_system {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int a= sc.nextInt();
        if (a>90)
            System.out.println("exellent");
        else if (a>80)
            System.out.println("good");
        else if (a>70)
            System.out.println("fair");
        else if(a>60)
            System.out.println("clears ecpectations");
        else if (a<61)
            System.out.println("below par");

        }

    }


