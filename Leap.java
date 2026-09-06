import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the year");
    int year=sc.nextInt();
    if(year % 400 ==0)
    {
       System.out.println("your year is leap yaer");
    }
    else if (year % 100 ==0)
    {
        System.out.println("your year is not a leap yaer");
    }
    else if(year %4==0)
    {
        System.out.println("your year is leap year");
    }
    else
    {
        System.out.println("your year is not a leap year");
    }
    sc.close();
        }
    
}
