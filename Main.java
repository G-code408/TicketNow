// class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello world!");

// } }


/**
 * Software Development A, Coursework 2
 * 
 * The coursework specification is provided in Canvas.
 * Please read through it in full before you start work.
 * 
 * @author INSERT YOUR NAME HERE
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ***** DO NOT CHANGE THIS PART OF THE CODE *****
		// 6 shows are currently showing in the 6 different halls of the cinema
		Show [] shows = new Show[6];  
		shows[0] = new Show("2B", new Movie("Shang-Chi and the Legend of the Ten Rings", "PG-13", 2)); 
		shows[1] = new Show("3A", new Movie("Dune", "PG-13", 3)); 
		shows[2] = new Show("1B", new Movie("Squid Game The Movie", "PG-15", 2)); 
		shows[3] = new Show("4A", new Movie("Shang-Chi and the Legend of the Ten Rings", "PG-13", 3)); 
		shows[4] = new Show("5A", new InternationalMovie("Deux Fils", "U", 2, "French")); 
		shows[5] = new Show("6B", new InternationalMovie("Druk", "U", 1, "Danish")); 
		System.out.println("*** WELCOME TO CINESOFT MOVIE BOOKING SYSTEM ***\n");
		///////////////////////////////////////////////////////////////////////////////////
    boolean flag = true; 
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(System.lineSeparator());
  while(flag){
    // Options 
      // Create a Scanner object
    System.out.println("Please input your choice (0-5):");
    for(int i = 0 ; i < 6 ; i++){
     System.out.println("#"+i+" "+shows[i].getTitle()+" "+shows[i].getID());
    }
    
    int index = sc.nextInt();  // Read user input
    //System.out.println(index);
    System.out.println(shows[index].getTitle());
    System.out.println("Enter row letter (A-O) and seat number (1-8) Ex: B9 ");
    String id = sc.next();
    int sn = id.charAt(1);
    //System.out.println(id.charAt(0));
    //System.out.println(sn-48);
    shows[index].buyTicket(id.charAt(0),(sn-48));
    System.out.println("Do you wish to continue ? (y/n) ");
    String proceed  = sc.next();
    //System.out.println("this is what proceed is : "+ proceed);
    if(proceed == "y")
    {
      System.out.println("Entering the y");
    }else
    {
      flag = false;
      for (int i = 0 ; i < 6 ; i++){
        System.out.println("Hall "+shows[i].getID()+" Seating Availability:  "+shows[i].getnumTickets()+"/"+shows[i].getnumSeats());
      }
    }
    
  }
		// ticket booking loop

    
		
		
		// list availability of seats for each movie/hall

		
		
	}

}
