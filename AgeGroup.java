import java.util.Scanner;
public class AgeGroup {
    public static void main(String[] args)
    {

    
    Scanner sc= new Scanner(System.in);
    System.out.println("enter your age");
    int age = sc.nextInt();
    if(age<=13)
    {
        System.out.println("your are in child categorize");
    }
    else if(age<=20)
    {
        System.out.println("your are in teen categorize");
    }
    else if(age<=60)
    {
        System.out.println("your are in adult categorize");
    }
    else if(age>=60)
    {
        System.out.println("your are in senior categorize");
    }
    sc.close();   
}
}