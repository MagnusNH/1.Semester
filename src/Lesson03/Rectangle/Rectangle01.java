package Lesson03.Rectangle;

public class Rectangle01 {
    private double width;
    private double length;

    //Konstruktør
public Rectangle01(double width, double length) {
    this.width = width;
    this.length = length;
    }

    //beregn areal
    public double beregnAreal(){
    return width*length;
    }

    //beregn omkreds
    public double beregnOmkreds(){
    return width+width+length+length;
    }
}
