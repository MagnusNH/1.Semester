package Lesson01.WriteToConsole;

public class WriteToConsole03 {
    public static void main(String[] args) {
        Message03();
        //Her trækker main message03
        Message04();
        Message05();
    }
    //Main trækker hvilke variabler/metoder, som du gerne vil have den skal køre.
    //Som er i stringen.

    public static void Message03() {
        //Dette er en variable/metode
        String text = "I forgot my lunch box! Ver03";
        //Værdien af variablen/metoden bliver sendt til main
        System.out.println(text);
        //Dette btyder at variablen/metoden er slut.
    }

    public static void Message04() {
        //Du kan lave flere variabler/metoden, som den kan trække.
        String text = "Hold 10 er bedst til stangtennis!";
        System.out.println(text);
    }

    public static void Message05() {
        String text = "Lets go";
        System.out.println(text);
        //Main trækker kun de variabler/metoden, du beder den trække.
    }
}