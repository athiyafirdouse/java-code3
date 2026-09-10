import java.util.Scanner;
public class SumalloddNUM {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int num = sc.nextInt(); 
      int sum = oddSum(num);     //call parameter,call oddsum method
      System.out.println("oddSum till "+ num +"is:" + sum);
      sc.close();
    }
    public static int oddSum(int num) //method defnition
    {
        int sum =0;

        for(int i=1;i<=num;i++)
        {
            if(i%2!=0)  // check for 10 numbers
            {
             sum +=i; // add odd number to sum
            }
        }
        return sum;
    } 

    

}
