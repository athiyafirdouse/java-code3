import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int sum = sumNumbers(num);

        System.out.println("Sum of numbers from 1 to " + num + " is: " + sum);

        sc.close();
    }

    public static int sumNumbers(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        return sum;
    }
}