package Lesson04.TivoliRide;

import java.util.Scanner;

public class TivoliRideTest01 {
    public static void main(String[] args){
        Test();
    }

    public static void Test(){
        //Scanner oprettes
        Scanner input = new Scanner(System.in);

        System.out.println("Hvor høj er du?: ");
        double heigth = input.nextDouble();

        System.out.println("Hvor gammel er du?: ");
        int age = input.nextInt();

        System.out.println("Hvor meget vejer du?" );
        double weigth = input.nextDouble();

        //Create criteria
        TivoliRide01 criteria = new TivoliRide01(heigth, age, weigth);

        //print result
        System.out.println(criteria.CanEnter());
    }
}
