package Lesson03.Rectangle;

public class Rectangle01Test {

    public static void main (String[] args){
    Opretrectangle();
    }

    public static void Opretrectangle() {
        //Opret rectangle
        Rectangle01 c1 = new Rectangle01(5, 10);
        udskrivarealer(c1);
        udskrivomkreds(c1);
    }

    public static void udskrivarealer(Rectangle01 c){
        //Udskriv arelaer
        System.out.println("Areal af rectangle:" + c.beregnAreal());
    }

    public static void udskrivomkreds(Rectangle01 c){
        //Udskriv Omkreds
        System.out.println("Omkreds af rectangle:" + c.beregnOmkreds());
    }

}
