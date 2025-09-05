package Lesson04.TivoliRide;

public class TivoliRide01 {
    double heigth;
    int age;
    double weigth;

    //Konstruktør til input af data
    public TivoliRide01(double heigth, int age, double weigth) {
        this.heigth = heigth;
        this.age = age;
        this.weigth = weigth;
    }

    //Method for entry rule
    public String CanEnter() {
        if (age >= 10 && heigth >= 170 && weigth <= 60) {
            return "God tur";
        } else {
            return "Du kan ikke tage på denne tur";
        }
    }
}
