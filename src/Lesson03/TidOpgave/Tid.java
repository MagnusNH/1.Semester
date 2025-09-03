package Lesson03.TidOpgave;

public class Tid {
    private int time;
    private int minut;
    private int sekund;

    public Tid(int time, int minut, int sekund){
        this.time=time;
        this.minut=minut;
        this.sekund=sekund;
    }
    //Method: Sekunder siden midnat
    public int totalsekunder() {
        return time * 3600 + minut * 60 + sekund;
    }
    //Method: Sekunder tilbage af dagen
    public int tilbage(){
        return 86400 - totalsekunder();
    }
    //Method: Sekunder jeg har brugt på opgaven
    public int brugt(Tid slut){
        return slut.totalsekunder()-this.totalsekunder();
    }
}
