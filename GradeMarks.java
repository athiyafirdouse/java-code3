import java.util.Scanner;
public class GradeMarks
{
    public static void main(String[] args)
    {    
    Scanner sc= new Scanner(System.in);
    System.out.println("enter your mark");
    int marks = sc.nextInt();
    if(marks>=90)
    {
        System.out.println("you got A grade");
    }
    else if (marks>=75)
    {
        System.out.println("you got B grade");
    }
    else if(marks>=60)
    {
        System.out.println("you got C grade");
    }
    else if(marks>=30)
    {
        System.out.println("you got D grade");
    }
    else if(marks<=30)
    {
        System.out.println("you got F grade");
    }
    else
    {
        System.out.println("your fail...need to improve");
    }

   sc.close();

    
}
}