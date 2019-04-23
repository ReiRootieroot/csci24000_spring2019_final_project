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

	public int GetItemCode() {
		String str = "";
                boolean keepGoing = true;
                int numCheck = 0;

                while(keepGoing) {
                        try {
                                System.out.print("Enter item code: ");
                                str = input.nextLine();
                                numCheck = Integer.parseInt(str);

                                if(numCheck >= 10000 && numCheck <= 99999)
                                        keepGoing = false;
                                else {
                                        System.out.println("\nNot a valid code. Please enter a number between 10000-99999.");
				}
                        } catch(NumberFormatException e) {
                                System.out.println("\nPlease enter an item number.");
                        } //end trycatch
                }//end while

                return numCheck;
		
	}//end GetItem

	public int GetTransID() {
                String str = "";
                boolean keepGoing = true;
                int numCheck = 0;

                while(keepGoing) {
                        try {
                                System.out.print("Enter transaction ID: ");
                                str = input.nextLine();
                                numCheck = Integer.parseInt(str);

                                if(numCheck >= 10000 && numCheck <= 99999)
                                        keepGoing = false;
                                else {
                                        System.out.println("\nNot a valid code. Please enter a number between 10000-99999.");
                                }
                        } catch(NumberFormatException e) {
                                System.out.println("\nPlease enter an item number.");
                        } //end trycatch
                }//end while

                return numCheck;

        }//end GetTransID

	public boolean GetPrimalTrim() {
		String str = "";
                boolean keepGoing = true;
                int numCheck = 0;
		boolean response = false;

                while(keepGoing) {
                        try {
				System.out.println("Are you entering a primal or trim?");
                                System.out.print("1) Primal\t2) Trim\nYour choice: ");
                                str = input.nextLine();
                                numCheck = Integer.parseInt(str);

                                if(numCheck >= 1 && numCheck <= 2)
                                        keepGoing = false;
                                else
                                        System.out.println("\nPlease enter a number between 1-2.");
                        } catch(NumberFormatException e) {
                                System.out.println("\nPlease enter a number between 1-2.");
                        } //end trycatch
                }//end while
		
		if(numCheck == 1)
                	response = true;
		else if(numCheck == 2)
			response = false;

		return response;
	}//end GetPrimalTrim

	public boolean GetEnterRemove() {
		String str = "";
		boolean keepGoing = true;
		int numCheck = 0;
		boolean response = false;
		
		while(keepGoing) {
			try {
				System.out.println("Are you entering or removing?");
				System.out.print("1) Entering\t2) Removing\nYour choice: ");
				str = input.nextLine();
				numCheck = Integer.parseInt(str);
				
				if(numCheck >= 1 && numCheck <= 2)
					keepGoing = false;
				else
					System.out.println("\nPlease enter a number between 1-2.");
			} catch(NumberFormatException e) {
				System.out.println("\nPlease enter a number between 1-2.");
			} //end trycatch
		}//end while
			
		if(numCheck == 1)
			response = true;
		else if(numCheck == 2)
			response = false;

		return response;
	}//end GetEnterRemove

	public double GetWeight() {
		String str = "";
                boolean keepGoing = true;
                double numCheck = 0;

		try {
			System.out.print("Enter weight: ");
			str = input.nextLine();
			numCheck = Double.parseDouble(str);
		} catch(NumberFormatException e) {
			System.out.println("\nPlease enter a number.");
		} //end trycatch

		return numCheck;

	}//end GetWeight

	public boolean Validate(String strInput) {
		String str = "";
		char c = 'a';
		boolean keepGoing = true;
		boolean Validated = false;
		int strlength = 0;
		
		while(keepGoing) {
			System.out.println(strInput);
			System.out.print("Is the entry above correct? (y/n): ");
			str = input.nextLine();
			strlength = str.length();
	
			if(strlength == 1) {
				c = str.charAt(0);	
				
				if(c == 'y'|| c == 'n')
					keepGoing = false;
				else
					System.out.println("\nPlease enter either 'y' or 'n'.");
			}
			else {
				System.out.println("\nPlease enter either 'y' or 'n'.");
				keepGoing = true;
			}
		}//end while

		if(c == 'y')
			return true;
		else
			return false;
		
	}//end Validate

}//end WeightMenu
