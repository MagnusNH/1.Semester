package Lesson03.Rectangle;

public class Rectangle02Test {

    public static void main (String[] args){
        Rectangle();
    }

    public static void Rectangle() {
        //Opret rectangle
        Rectangle01 c1 = new Rectangle01(200, 300);

    double areal1 =c1.beregnAreal();
    double omkreds1 =c1.beregnOmkreds();

        System.out.println("Areal af rectangle:" + c1.beregnAreal());
        if (areal1 > 100){
            System.out.println("Areal er stort");
        }else{
            System.out.println("Areal er småt");
        }


        System.out.println("Omkreds af rectangle:" + c1.beregnOmkreds());
        if(omkreds1 > 100){
            System.out.println("Omkreds er stor");
        }else{
            System.out.println("Omkreds er lille");
        }
    }
}

