import java.util.Scanner;
public class SimpleIntrest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Simple Interest Calculator");

        System.out.println("Enter the Principal Amount (Rs):");
        int principal = sc.nextInt();

        System.out.println("Enter the Rate of Interest:");
        float rate = sc.nextFloat();

        System.out.println("Enter the Time Taken:");
        float time = sc.nextFloat();

        float interest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is: " + interest);

        sc.close();
    }
}

    

