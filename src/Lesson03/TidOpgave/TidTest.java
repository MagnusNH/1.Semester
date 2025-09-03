package Lesson03.TidOpgave;

public class TidTest {
    public static void main (String[]args){
        //Opretter her tidspunkt fra start
        Tid tidspunkt = new Tid(21,30,45);

        System.out.println("Sekunder tilbage til midnat: "+ tidspunkt.totalsekunder()+ " Sekunder");
        System.out.println("Sekunder til midnat: "+tidspunkt.tilbage()+" Sekunder");

        //Opretter her tidspunkt jeg stopper opgaven
        Tid slut = new Tid(23,51,58);
        System.out.println("Sekunder jeg har brugt på opgaven: "+tidspunkt.brugt(slut) + " Sekunder");
    }
}
