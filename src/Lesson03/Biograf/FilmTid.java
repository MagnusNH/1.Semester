package Lesson03.Biograf;

public class FilmTid {
    private int timer;
    private int minutter;
    private int sekunder;

    //Construktør
    public FilmTid (int timer, int minutter, int sekunder) {
        this.timer = timer;
        this.minutter = minutter;
        this.sekunder = sekunder;
    }

    //Beregning af filemns længde i sekunder
    public int totalsekunder(){
        return timer * 3600 + minutter * 60 + sekunder;
    }
    // Beregn sluttidspunkt: starttid + filmens længde
    public FilmTid slutTid(FilmTid start) {
        int startSek = start.totalsekunder();
        int længdeSek = this.totalsekunder();
        int slutSek = (startSek + længdeSek) % 86400; // modulo håndterer over midnat

        int h = slutSek / 3600;
        int m = (slutSek % 3600) / 60;
        int s = slutSek % 60;

        return new FilmTid(h, m, s);
    }

    @Override
    public String toString() {
        return timer + ":" + minutter + ":" + sekunder;
    }

}