package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;


    public double Netsalary(){
        return  grossSalary-tax;

    }
    public void IncreaseSalary(double percentage){
        grossSalary+=grossSalary*percentage/100.0;
    }

    public String toString(){
        return "Update data: "+ name+", $ " + String.format("%.2f",Netsalary());

    }
}
