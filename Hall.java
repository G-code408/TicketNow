/*
 * Hall.java
 */
public class Hall {

private String id;
private int noRows, noSeats, numOfTickets;
private Ticket[][] ticket;
//Default constructor
public Hall(){};
//constructor that takes in ID





public Hall(String id){
  this.id = id;
  // the size of the 2-d array "ticket" is determined by the hallID 
  //hallID is a string 
  //and if it is A , the array must be 9x10
  System.out.println(this.id.charAt(1));
  if (this.id.charAt(1) == 'A')
  {
    this.ticket = new Ticket[9][10];
		//Abdullah wrote this 
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				this.ticket[i][j] = new Ticket();
			}
		}
		//done 
    this.noRows = 9;
    this.noSeats = 10;
    this.numOfTickets = 90;
    //System.out.println("A type A hall has been incarnated");
  } else {
    this.ticket = new Ticket[15][8];
		//Abdullah wrote this 
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 8; j++) {
				this.ticket[i][j] = new Ticket();
			}
		}
    this.noRows = 15;
    this.noSeats = 8;
    this.numOfTickets = 120;
		//done 
    //System.out.println("A type B hall has been incarnated");
    }
   // System.out.println(this.ticket[0][3].life);
  }






//setter function for ID
public void setID(String id){
  this.id = id;
}
//getter function for ID
public String getID(){
  return this.id;
};

public void setTicket(int rowIdx, int seatNo){

  this.ticket[rowIdx][seatNo].setOccupied(true);
  this.ticket[rowIdx][seatNo].setRowLetter(rowIndex2Letter(rowIdx));
  this.ticket[rowIdx][seatNo].setSeatNo(seatNo);
  this.numOfTickets--;
}

public int getNoSeats(){
  return this.noSeats;
}

public int getNoRows(){
  return this.noRows;
}

public int getnumTickets(){
  return this.numOfTickets;
}
	
	// Note: this static method is given
	// Converts row letter (char) to index number (int)
	public static int rowLetter2Idx(char letter) {
		return (int)(letter)-65;
	}
	
	// Note: this static method is given
	// Converts index number (int) to row letter (char)
	public static char rowIndex2Letter(int idx) {
		return (char)(idx+'A');
	}
	
	
}
