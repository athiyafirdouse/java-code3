import java.util.Scanner;
public class Compound {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to compond interst");

        System.out.println("Enter the Principal Amount (Rs):");
        int principal = sc.nextInt();

        System.out.println("Enter the Rate of Interest:");
        float rate = sc.nextFloat();

        System.out.println("Enter the Time Taken:");
        float time = sc.nextFloat();

        double compound =  principal *Math.pow((1+rate/100),time);
        System.out.println("the compound interst is:"+compound);
    }
    
}
