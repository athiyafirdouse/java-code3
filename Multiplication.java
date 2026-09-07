import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enterthe number");
        int num = sc.nextInt();
        printMultiplicationTable(num); //call the method
    }
    public static void printMultiplicationTable(int num) //method defnition
    {
        int i=1;
        while(i<=10)
        {
            System.out.println(num + "X"+i+"="+(num * i));
            i++;
        }
       
    }
      
}
