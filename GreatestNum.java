import java.util.Scanner;
public class GreatestNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        {
            System.out.println("enter the number1");
            int num1 = sc.nextInt();
            System.out.println("enter the number 2");
            int num2 = sc.nextInt();
            System.out.println("entre the number 3");
            int num3 = sc.nextInt();
            if(num1<num2&&num2<num2)
            {
            System.out.println("NUM2 is greater number");
            }
            else if(num3<num1)
            {
            System.out.println("num1 is graeter");
            }
            else
            {
                System.out.println("num3 is greater ");
            }
         
        }
        sc.close();
    }
    
}
