import java.util.Scanner;
public class Leftshift {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num1");
        int num=sc.nextInt();

        int result = num<<1;
        System.out.println("your result is:"+ result);
        sc.close();
    }
}
