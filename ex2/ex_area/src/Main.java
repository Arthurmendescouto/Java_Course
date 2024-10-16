import java.util.Scanner;
import entities.formulas;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        formulas calc=new formulas();
        System.out.println("Enter rectangle width and height");
        calc.height= sc.nextDouble();
        calc.width= sc.nextDouble();
        System.out.println(calc);
sc.close();



    }
}