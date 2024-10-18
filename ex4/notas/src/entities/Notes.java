package entities;

public class Notes {
   public String name;
   public double note1;
    public double note2;
    public double note3;
    public double final_grade;
    public double calc(){
         return final_grade=note1+note2+note3;
    }
    public double misspoints(){
         if(final_grade<60) {
             return 60 - final_grade;
         }
             return 0;


    }
    public String toString(){

        return "FINAL GRADE= "+final_grade;

    }
}
