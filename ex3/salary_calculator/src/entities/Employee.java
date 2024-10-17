package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;


    public void IncreaseSalary(double percentage){
         this.percentage=grossSalary/percentage;

    }
    public double Netsalary(){
        return grossSalary-tax+percentage;

    }
    public String toString(){
        return "Update data: "+ name+", " + String.format("%.2f",Netsalary());

    }
}
