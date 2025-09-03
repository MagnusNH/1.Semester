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

        if(heigth<=170) {
            System.out.println("Bliv højere tak");
        }else if(age<=10){
            System.out.println("Bliv ældre tak");
        }else{
            System.out.println("God tur");
    }
}
}
