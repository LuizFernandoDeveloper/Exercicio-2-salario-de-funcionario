import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Name:");
        employee.setName(sc.nextLine());
        System.out.print("Gross salary:");
        employee.setGrossSalary(sc.nextDouble());
        System.out.print("Tax:");
        employee.setTax(sc.nextDouble());
        System.out.println();
        System.out.printf("Employee: "+ employee.getName() +", $ "+ String.format("%.2f%n", employee.netSalary()));
        System.out.print("whtich percent to encrease salary?");
        employee.increaseSalary(sc.nextDouble());
        System.out.printf("Update data: "+ employee.getName()+", $ "+String.format("%.2f%n",employee.netSalary()));
        sc.close();
    }
}
