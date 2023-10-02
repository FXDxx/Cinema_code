package PracticeLab2;

public class CinemaDetails {
    private int ticketprice;
    Time time;
    Location location;
    Movie movie;

    CinemaDetails(Location location,Movie movie,int ticketprice,Time time){
        this.location = location;
        this.movie = movie;
        this.ticketprice = ticketprice;
        this.time = time;
    }
    public void setticketprice(int ticketprice){
        this.ticketprice = ticketprice;
    }
    public int getticketprice(){
        return ticketprice;
    }
    public String toString(){
        String cinemaDetail = String.format("Location: %s\nMovie Details:\n %s\nticketprice: %d\nStart Time: %s",location,movie,ticketprice,time);
        return cinemaDetail;
    }

   
    
}
