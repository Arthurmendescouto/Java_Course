import entities.Notes;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        Notes notes=new Notes();
        System.out.println("Qual o nome do aluno?");
        notes.name=sc.nextLine();
        System.out.println("Qual a nota do primeiro semestre?");
        notes.note1=sc.nextDouble();
        System.out.println("Qual a nota do segundo semestre?");
        notes.note2=sc.nextDouble();
        System.out.println("Qual a nota do terceiro semestre?");
        notes.note3=sc.nextDouble();

        notes.calc();

        if(notes.final_grade<60){
            System.out.println(notes);
            System.out.println("FAILED");
            System.out.printf("Missing %.2f points%n",notes.misspoints());
        }else{
            System.out.println(notes);
            System.out.println("PASS");
        }
sc.close();

    }
}