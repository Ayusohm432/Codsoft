//Task1
// Java Program for Number Game Creted bu Ayush..

//Importing Java Packages.
import java.util.Scanner;
import java.util.Random;

//  class Game for different mehods used in Game
class Game {
	//Declaring and Initializing variables
	private int num;
	private int input;
	private int no_of_guesses = 0;

    //Method to return no of guesses.
	public int getno_of_guesses() {
		return  no_of_guesses;
	}
	
    //method to generate random integer lower than 100.
	public Game() {
		Random r = new Random();
		//Generaating Random Number and Storing in num variable
		num = r.nextInt(100);

	}
	//Metod for Taking User Input
	public void takeUserInput() {
		Scanner sc = new Scanner(System.in);
        System.out.println();
		System.out.print("\t\t\tEnter your number:- ");
		input = sc.nextInt();

	}
	// method for checking the entered numbers.
	public boolean detect_number() {
		no_of_guesses++;
		if (num == input) {
            System.out.printf("\n\t\tYou guessed it correct,it was %d ,in %d attempts\n",num, no_of_guesses);
            return true;
		} 
		else if (num > input) {
			System.out.println("\n\t\t\tYour guess is too low....");
			System.out.println("\t\t\tPlease Enter a higher number....\n");

		} 
		else {
			System.out.println("\n\t\tYour guess is too high....");
			System.out.println("\t\tPlease Enter a Lower number....\n");

		}
		return false;
	}
	//method for marking end of rounds.
	public void separate() {
		System.out.println();
		
		for (int i = 0; i <= 73; i++) {
			System.out.print("-");
		}
        System.out.println();
		
	}
	
	



}
// class for the task
public class  NumberGame{

	
	//main method
	public static void main(String[] args) {
		//declaring and initializing Variable
        boolean d=false;
        char choice;
		//creating object of game class to access its methods. 
		Game g = new Game();
        //Game Title
	    System.out.println("\t\t\t\tGUESS THE NUMBER");
		//Adding the separate method
		g.separate();
		//Introducing the Game Rules
		System.out.println();
		System.out.println("\t\t\t\t    GAME RULES");
        System.out.println("\t\t\t 1.Number Range is from 1 tO 100");
		System.out.println("\t\t\t 2.Maximum Number of Rounds = 5 ");
		System.out.println("\t\t\t 3.A Suggestion will be Given in Each Round.");
		g.separate();

		//Starting of Game
		System.out.printf("\t\t\t\t    WELCOME!\n  \t\t\t       Let's play the Game\n");
		g.separate();
        
        //Loop for Repeatation of Rounds
        for (int i = 0; i < 5 ; i++) {

			System.out.printf("\n\t\t\t\t  ROUND %d", i + 1);
			System.out.println();
            g.takeUserInput();
            d=g.detect_number();
			if(d){
				System.out.println("\n\t\t\tCONGRATULATION ! YOU WON");
			    break;
			}
			g.separate();
        }
        if(!d){
			System.out.println("\n\t\t\t\t ...YOU LOST... ");
            System.out.printf("\t\t\tTRY AGAIN ! BETTER LUCK NEXT TIME...");
        }
       
        g.separate();
        System.out.println("\n\t\t\t\tTHANKS FOR PLAYING....\n");
        
        g.separate();
		//Ending of Game
		
		g.separate();
		//Replay For Game
        System.out.println("\n\t\t\tIf you want to play again \n\n\t\t\t1.Press  y to continue \n\t\t\t2.press q to exit..");
        System.out.print("\n\t\t\tEnter Your Chioce:");
        Scanner sc = new Scanner(System.in);
        choice= sc.next().charAt(0);
        switch(choice){
            case 'y':
                  main(null);
                  break;
            case 'q':
                  System.exit(0);
                  break;
            default:
                  System.exit(0);
                   break;
        }


	}

}