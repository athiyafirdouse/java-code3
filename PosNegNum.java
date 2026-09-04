import java.util.Scanner;
public class PosNegNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if(num>0)
        {
            System.out.println("its postive number");
        }
        else if(num==0)
        {
            System.out.println("its zero");
        }
        else
        {
            System.out.println("its negative number");
        }

        
    }
    
}
