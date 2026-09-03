import java.util.Scanner;
public class Productfloat {
 public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("enter the number1");
    float number1= input.nextFloat();
    System.out.println("enter the second number2");
    float number2= input.nextFloat();
    
    float number3=number1*number2;

    System.out.println("the product of two floating number is:"+ number3);
 }
    
}
