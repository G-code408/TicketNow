/*
 * Ticket.java
 */
public class Ticket {

private char rowLetter;
private int seatNo;
private boolean isOccupied;
public String life = "Im alive";
//this is a constructor 
//it builds an object of the class 
//when I leave the constructor empty, it shows default behavior
//so this is the default constructor below
public Ticket(){isOccupied = false;};

//this is my parameterized constructor , which takes two parameters 
public char helper(int rowIdx){
char[] rows = {'A','B','C','D','E','F','G','H','I','I','J','K','L','M','N','O'};
  return rows[rowIdx];
}

public Ticket(int rowIdx,int seatNo ){
 this.rowLetter = helper(rowIdx); 
 this.seatNo = seatNo;
}

//get the row letter
public char getRowLetter(){
  return this.rowLetter;

};

//set the row letter 
public void setRowLetter(char l){
  this.rowLetter = l ;
}

//get the seat number
public int getSeatNo(){
  return this.seatNo;
};

//set the seat number
public void setSeatNo(int num){
  this.seatNo = num;
}
public boolean getOccupied(){
  return this.isOccupied;
  }
public void setOccupied(boolean b){
  this.isOccupied = b;
}

}