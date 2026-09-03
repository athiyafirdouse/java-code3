import java.util.Scanner;
public class Arithmetic 
{   
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("welcome to arithmetic calculator");
        System.out.println("enter the first number");
        int a= input.nextInt();
        System.out.println("enter the second number");
        int b = input.nextInt();

        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
    

        System.out.println("the value of c is :"+ c);
        System.out.println("the value of d is :"+ d);
        System.out.println("the value of e is : "+ e);
        System.out.println("the value of f is :"+ f);
        System.out.println("the value of g is :"+ g);
    }




}
