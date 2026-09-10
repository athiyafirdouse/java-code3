import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        boolean isPrime = isPrime(num);   //call the method
        if(isPrime)                                               
        {
            System.out.println("your number is prime");

        }
        else{
            System.out.println("your number  is not prime");
        }
    }
    
    public static boolean isPrime(int num)            /*public static boolean isPrime(int num)
Takes a number as input.
Returns true if prime.
Returns false if not prime.*/
    {
        int i=2;
        while(i<num)
        {
         if(num % i ==0)
         {
            return false;
         }
         i++;
        }
   

       return true;
    }
    
}
