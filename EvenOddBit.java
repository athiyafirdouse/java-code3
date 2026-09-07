import java.util.Scanner;
public class EvenOddBit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int Num = sc.nextInt();
        
        if((Num & 1)==1)
        {
           System.out.println("your number is odd");
        }
        else
        {
            System.out.println("your num is even");
        }
        sc.close();
    }
    
}

