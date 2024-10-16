package entities;

public class formulas {
    public String texto="";
    public double height;
    public double width;


    public double area(){
        return height*width;
    }
    public double perimeter(){
     return 2*(height+width);
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(height,2)+Math.pow(width,2));
    }
    public String toString(){
         return texto
                 +"AREA= " + String.format("%.2f",area())+"\n"
                 +"PERIMETER= "+ String.format("%.2f",perimeter())+"\n"
                 +"DIAGONAL= "+ String.format("%.2f",diagonal());

    }
}
