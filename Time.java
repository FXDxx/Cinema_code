package PracticeLab2;

public class Time {
    private int day;
    private int month;
    private int year;

    Time(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        String timeDetail = String.format("%d/%d/%d",day,month,year);
        return timeDetail;
    }

}
