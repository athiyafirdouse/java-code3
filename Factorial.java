import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int Num = sc.nextInt();
        //call parametre
       
        long fact =1;
        for (int i=1;i<=Num;i++)
        {
            fact = fact * i;
        }
         System.out.print("factorial of "+ Num +"is:" + fact);
    }
     
     

}
