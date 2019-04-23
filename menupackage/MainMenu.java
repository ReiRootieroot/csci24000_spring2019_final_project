//MainMenu.java

package menupackage;
import java.util.*;
import java.io.*;
import meatpackage.*;
import transpackage.*;

public class MainMenu implements Serializable {
	
	transient Scanner input = new Scanner(System.in);

	public MainMenu() {
		;
	}//end constructor

	public int GetOption(int min, int max) {

		String str = "";
                boolean keepGoing = true;
                int numCheck = 0;

                while(keepGoing) {
                        try {
                                System.out.print("Enter a number between " + min + "-" + max + ": ");
                                str = input.nextLine();
                                numCheck = Integer.parseInt(str);

                                if(numCheck >= min && numCheck <= max)
                                        keepGoing = false;
                                else {
                                        System.out.println("\n Please enter a number between " + min + "-" + max + ".");
				}
                        } catch(NumberFormatException e) {
                                System.out.println("\nPlease enter a number between " + min + "-" + max + ".");
                        } //end trycatch
                }//end while

                return numCheck;

	}//end GetOption


}//end MainMenu
