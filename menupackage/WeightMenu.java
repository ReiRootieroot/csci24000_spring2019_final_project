//WeightMenu.java

package menupackage;
import java.util.*;
import java.io.*;
import meatpackage.*;

public class WeightMenu implements Serializable {

	transient Scanner input = new Scanner(System.in);

	public WeightMenu() {
		;
	}//end constructor


	public int GetInput() {
		String str = "";
		boolean keepGoing = true;
		int numCheck = 0;
		
		while(keepGoing) {
			try {
				System.out.println("Are you entering or removing?");
				System.out.print("1) Entering\t2)Removing\nYour choice: ");
				str = input.nextLine();
				numCheck = Integer.parseInt(str);
				
				if(numCheck >= 1 && numCheck <= 2)
					keepGoing = false;
				else
					System.out.println("\nPlease enter a number between 1-2.\n");
			} catch(NumberFormatException e) {
				System.out.println("\nPlease enter a number between 1-2.\n");
			} //end trycatch
		}//end while
			
		return numCheck;

	}//end GetInput

}//end WeightMenu
