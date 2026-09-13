import java.util.Scanner;
public class employeedata {
 
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Basic Salary:");
        double basicSalary = sc.nextDouble();

        double hra = basicSalary * 0.20;   // 20% HRA
        double da = basicSalary * 0.10;    // 10% DA
        double grossSalary = basicSalary + hra + da;

        System.out.println("\nEmployee Details");
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);

        sc.close();
    }
}
    

