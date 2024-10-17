import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        Employee employee=new Employee();
        System.out.print("Name: ");
        employee.name=sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary= sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax=sc.nextDouble();
        System.out.print("Which percentage to increase salary?");
        double percentage=sc.nextDouble();
        employee.IncreaseSalary(percentage);
        System.out.println(employee);

    }
}