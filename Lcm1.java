import java.util.Scanner;
public class Lcm1 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        int Lcm = findLCM(num1,num2);
        System.out.println("LCM of" + num1 + "and" + num2 + "is:"+Lcm);
        sc.close();
    }
    
    public static int findLCM(int num1,int num2)
    {
        int max= (num1>num2) ? num1 :num2;

        while(true)
        {
            if(max % num1 ==0 && max % num2 ==0)
            {
                return max;
            }
            max++;
        }
    }
    
}
