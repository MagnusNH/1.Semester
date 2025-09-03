package Lesson03.Dato;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Test();
    }
        public static void Test() {
            //Scanner oprettes
            Scanner input = new Scanner(System.in);
            //Hvad starter scanneren med at skrive
            System.out.print("Skriv EU eller USA: ");
            //Får scanneren til at vælge næste String som hedder choise
            String choise = input.nextLine();

            //Opret dato
            MyDate d1 = new MyDate(31, 2025, "August");

            //Hvis EU så skriver den første println og hvis USA skriver den anden
            if (choise.equals("EU")) {
                System.out.println("Europiæsk dato: " + d1.getEUdato());
            } else if (choise.equals("USA")) {
                System.out.println("Amerikansk dato: " + d1.getUSAdato());
            }
        }
    }

