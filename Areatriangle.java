import java.util.Scanner;
public class Areatriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("entre the breath of triangle");
        double B = sc.nextDouble();
        System.out.println("entre the height of triangle");
        double C= sc.nextDouble();
        
        double Area = 0.5*B*C;
        
        System.out.println("the value of perimetre of triangle:"+ Area);

    }
    
}
