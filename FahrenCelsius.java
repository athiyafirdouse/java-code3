import java.util.Scanner;
public class FahrenCelsius {
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("welcome to tempreture convert");
    System.out.println("enter the tempreture in F");
    float Fah= sc.nextFloat();
    float cel=(Fah-32)*5/9;
    System.out.println("your tempreture is:" + cel);
    
}
}