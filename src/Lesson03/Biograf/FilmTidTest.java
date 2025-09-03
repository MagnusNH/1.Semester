package Lesson03.Biograf;

import java.util.Scanner;

public class FilmTidTest {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //Bruger skal her indtaste filmlængde
        System.out.println ("Indtast starttid (T M S:)");
        int starth = input.nextInt();
        int startm = input.nextInt();
        int starts = input.nextInt();

        //Her opretter du et filmtid-objekt til starttidspunkt
        FilmTid start = new FilmTid(starth, startm, starts);

        //Her opretter du et filmtid-objekt til filmens længde
        FilmTid længde = new FilmTid(2,45,30);

        System.out.println("Filmen varer: " + længde.totalsekunder() + " sekunder");
        System.out.println("Filmen slutter: " + længde.slutTid(start));

        input.close();
    }
}
