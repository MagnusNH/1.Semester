package Lesson02.HomeWork;

public class TShirtTest {
    public static void main(String[] args) {
        TShirt t1 = new TShirt();
        t1.color = "White";
        t1.size = "Medium";
        t1.print = "Skull";
        t1.price = 500;
        t1.playIt();

        TShirt t2 = new TShirt();
        t2.color = "Black";
        t2.size = "Large";
        t2.print = "Custom print";
        t2.price = 1000;
        t2.playIt();

        TShirt t3 = new TShirt();
        t3.color = "Pink";
        t3.size = "Small";
        t3.print = "Unicorn";
        t3.price = 750;
        t3.playIt();

        TShirt t4 = new TShirt();
        t4.color = "White";
        t4.size = "Medium";
        t4.print = "Stangtennis print";
        t4.price = 4000;
        t4.playIt();
    }

//      O
//      |\
//      | \
//      |  \
//      |   \
//      |    o (#)
//      |        \
//      |         \
//      |
//      |
}
