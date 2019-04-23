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

	public void Populate(ArrayList<Primal> arrayP) {
		Primal meat = new BottomRound();
		arrayP.add(meat);
		meat = new BeefStew();
		arrayP.add(meat);
		meat = new Brisket();
		arrayP.add(meat);
		meat = new Chuck();
		arrayP.add(meat);
		meat = new DARibeyeBless();
		arrayP.add(meat);
		meat = new Flank();
		arrayP.add(meat);


	}//end Populate

	public void UserSerial(ArrayList<Primal> arrayP, ArrayList<TransClass> arrayT, WeightMenu weightmenu) {

		String str = "";
                boolean yesSerial = false;

		str = "Would you like to reload the previous system? (You will lose progress if you choose not to) (y/n): ";
                
		yesSerial = weightmenu.Validate(str);
		if(yesSerial) {

			try {
                        	FileInputStream file = new FileInputStream("SavedArrayP.txt");
                       		ObjectInputStream in = new ObjectInputStream(file);

                        	arrayP = (ArrayList<Primal>)in.readObject();

                        	in.close();
                        	file.close();

                	} catch(IOException e) {
                        	System.out.println(e);
                	} catch(ClassNotFoundException ex) {
                        	System.out.println(ex);
                	}//endtrycatch

                	try {
                        	FileInputStream file = new FileInputStream("SavedArrayT.txt");
                        	ObjectInputStream in = new ObjectInputStream(file);

                        	arrayT = (ArrayList<TransClass>)in.readObject();

                        	in.close();
                        	file.close();

                	} catch(IOException e) {
                        	System.out.println(e);
                	} catch(ClassNotFoundException ex) {
				System.out.println(ex);
                	}//end trycatch

		}//end if

	}//end UserSerial

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
                                        System.out.println("\nPlease enter a number between " + min + "-" + max + ".");
				}
                        } catch(NumberFormatException e) {
                                System.out.println("\nPlease enter a number between " + min + "-" + max + ".");
                        } //end trycatch
                }//end while

                return numCheck;

	}//end GetOption

	public void EnterIntoInventory(ArrayList<Primal> arrayP, ArrayList<TransClass> arrayT, WeightMenu weightmenu, int id) {
		String str = "";
		String name = "";
		int length = arrayP.size();
		int location = 0;
		int codeInput = 0;
		int codeArray = 0;
		double weightInput = 0.00;
		boolean enterRemove = true;
		boolean continueProcess = false;
		boolean continueProcess2 = false;
		boolean codeFound = false;
		boolean needTrim = false;
		boolean addTrue = false;
		boolean keepGoing = true;

		System.out.println();
		
		codeInput = weightmenu.GetItemCode();
		
		for(int i = 0; i < length; i++) {
			codeArray = arrayP.get(i).GetItemCode();

			if(codeArray == codeInput) {
				codeFound = true;
				needTrim = arrayP.get(i).GetNeedTrim();
				name = arrayP.get(i).GetName();
				location = i;
			}
		}//end for loop

		if(codeFound) {
			str = "Item Code: " + codeInput + ", " + name;
               		continueProcess = weightmenu.Validate(str);
		}
		else {
			System.out.println("Item Code: " + codeInput + " was not found.");
			System.out.println("Returning to main menu.");
		}
	
		if(continueProcess) {
			if(codeFound) {
				if(needTrim)
					weightmenu.GetPrimalTrim();

				addTrue = weightmenu.GetEnterRemove();
				weightInput = weightmenu.GetWeight();

				if(addTrue)
					str = "Weight added: " + weightInput;
				else
					str = "Weight subtracted: " + weightInput;
				
				continueProcess2 = weightmenu.Validate(str);

				if(continueProcess2) {
					System.out.print(weightInput + " lb. ");
					
					if(addTrue) {
						arrayP.get(location).AddWeight(weightInput);
						System.out.print("added.\n");
					}
					else {
						arrayP.get(location).SubtractWeight(weightInput);
						System.out.print("subtracted.\n");
					}

					Primal meat = arrayP.get(location);
					arrayT.add(new TransClass(meat, weightInput, addTrue, id));
					arrayT.get(arrayT.size()-1).WriteTrans();	
				}
				else
					System.out.println("\nTransaction cancelled. Returning to main menu.");
			
			}//end if
			else
				System.out.println("Code not found. Returning to main menu.");
		}//end if
		else
			System.out.println("\nNo changes made.");
	}//end EnterIntoInventory
}//end MainMenu
