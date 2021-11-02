/*
 * Show.java
 */
public class Show {
private Movie movie;
private Hall hall;

public Show(){};

public Show(String hallID, Movie movie){
  this.hall = new Hall(hallID);
  this.movie = movie;
  this.movie.title = movie.title;
  this.movie.rating = movie.rating;
  this.movie.sessionNo = movie.sessionNo;
};

public String getID(){
  return this.hall.getID();
}
 public String getTitle(){
   return this.movie.getTitle();
 }

 public int getnumSeats(){
   return ( this.hall.getNoRows()*this.hall.getNoSeats() );
 }

 public int getnumTickets(){
   return this.hall.getnumTickets();
 }


public void buyTicket(char row,int seatNo){
  System.out.println(Hall.rowLetter2Idx(row));
  System.out.println(seatNo);
  this.hall.setTicket(this.hall.rowLetter2Idx(row),seatNo);
}
}

