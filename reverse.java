import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to reverse:");
        int num = sc.nextInt();

        int reverse = reverse(num);

        System.out.println("Reverse of your number: " + reverse);

        sc.close();
    }

    public static int reverse(int num) {

        int newNum = 0;

        while (num > 0) {

            int digit = num % 10;            //eg:1234 % 10 = 4digit
                                                                
            newNum = newNum * 10 + digit;  //0*10+4
            num = num / 10;  //remove last digith  eg:123%10=3 digit
        }

        return newNum;
    }
}