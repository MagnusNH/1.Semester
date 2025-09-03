package Lesson03.Dato;

public class MyDate {
    private int date;
    private int year;
    private String month;

    // constructor
    public MyDate(int date, int year, String month) {
        this.date = date;
        this.year = year;
        this.month = month;
    }

    // method: til at vise USA format
    public String getUSAdato() {
        return (month + "/" + date + "/" + year);
    }

    // method til at vise EU format
    public String getEUdato() {
        return this.date + " " + this.month + "-" + this.year;
    }
}
