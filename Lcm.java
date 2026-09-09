import java.util.Scanner;
public class Lcm {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        int Sum = SumNumber(num);
        System.out.println("sum numbers from 1 to"+  num + "is:"+Sum);
        sc.close();
    }
    public static int SumNumber(int num)
    {
        int Sum = 0;

        for(int i=1;i<=num;i++)
        {
            Sum+=i;
        }

        return Sum;
    }
}
