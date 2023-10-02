package PracticeLab2;

public class Movie {
    private String movieName;
    private int duration;
    private String Genre;

    Movie(String movieName,int duration,String Genre){
        this.movieName = movieName;
        this.duration = duration;
        this.Genre = Genre;
    }

    public void setmovieName(String movieName){
        this.movieName = movieName;
    }
    public String getmovieName(){
        return movieName;
    }
    public void setduration(int duration){
        this.duration = duration;
    }
    public int getduration(){
        return duration;
    }
    public void setGenre(String Genre){
        this.Genre = Genre;
    }
    public String getGenre(){
        return Genre;
    }

    public String toString(){
        String movieDetail = String.format("Movie Name: %s\t duration: %d(min)\t Genre: %s",movieName,duration,Genre);
        return movieDetail;
    }
    public boolean equals (Object o){
        Movie cinema = (Movie) o ;
        if(cinema.getGenre().equals(this.Genre) && cinema.getmovieName().equals(this.movieName))
        {
            return true;
        } 
        else{
            return false;
        }
}
}
