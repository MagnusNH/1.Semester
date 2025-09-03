package Lesson04.TivoliRide;

public class TivoliRide01 {
   double height;
   int age;

   public TivoliRide01(double height, int age){
       this.height= height;
       this.age=age;
   }

   //Method for entry rule
    public String CanEnter() {
        if(age>=10 && height>170){
            return "God tur";
        } else {
            return "Bliv ældre";
        }
    }
}
