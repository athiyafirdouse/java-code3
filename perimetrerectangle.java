import java.util.Scanner;
public class perimetrerectangle {//adding all four sides of reactangel
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("entre the value of side A");
        int sideA = input.nextInt();
        System.out.println("enter the value of sideB");
        int sideB=input.nextInt();
        System.out.println("enter the value of sideC");
        int sideC=input.nextInt();
        System.out.println("enter the value of sideD");
        int sideD=input.nextInt();
    
    
        int ABCD = sideA+sideB+sideC+sideD;
        System.out.println("the perimetre of a rectangle:"+ ABCD );
        

    }
}
