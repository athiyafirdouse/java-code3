import java.util.Scanner;

public class swap {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("welcome to swapping  statement");
        System.out.println("enter the value of a");
        int a= sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
         int c=a;
         a=b;
         b=c;
         System.out.println("SWAPPING" );
        System.out.println("the value of A is:" + a );
        System.out.println("the value of B is:" + b );
       

    }
}
