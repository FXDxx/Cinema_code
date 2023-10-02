package PracticeLab2;
import java.util.Scanner;

public class Cinema {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter location:");
        String location = sc.nextLine();
        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();
        System.out.print("Enter Movie Duration: ");
        int duration = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Genre: ");
        String Genre = sc.nextLine();
        System.out.print("Enter Ticket Price: ");
        int ticketprice = sc.nextInt();
        System.out.print("Release Date: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        CinemaDetails c1 = new CinemaDetails(new Location(location), new Movie(movieName,duration,Genre), ticketprice, new Time(day,month,year));
        CinemaDetails c2 = new CinemaDetails(new Location("31-A Romeo Street, Beroozgar"), new Movie("Adventure of Khalid", 200,"War,Violence"), 1200, new Time(10, 12, 2023));
        CinemaDetails c3 = new CinemaDetails(new Location("131-Z Romeo Street, Beroozgar"), new Movie("Advent of Science", 100,"Sci-Fi,History,Story"), 1200, new Time(9, 07, 2023));
        CinemaDetails c4 = new CinemaDetails(new Location("331-B Roth Street, Beroozgar"), new Movie("Beginning of end", 250,"War,Violence,Thriller"), 1200, new Time(10, 05, 2023));
        CinemaDetails c5 = new CinemaDetails(new Location("1089-GA Rothmire Street, Beroozgar"), new Movie("Red riding hood", 200,"Romance,Violence,Horror"), 1100, new Time(20, 04, 2023));

        CinemaDetails cin[] = new CinemaDetails[5];
        cin[0] = c1;
        cin[1] = c2;
        cin[2] = c3;
        cin[3] = c4;
        cin[4] = c5;
        for(int i = 0; i<5;i++){
            System.out.println(cin[i]);
        }

        Boolean cinema = c1.equals(c2);
        System.out.println(cinema);
    }
}
