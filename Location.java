package PracticeLab2;

public class Location {
    private String location;

    Location(String location){
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString(){
        String locationOfCinema = String.format("%s",location);
        return locationOfCinema;
    }
}
