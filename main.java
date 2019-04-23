//main.java

import meatpackage.*;
import menupackage.*;
import transpackage.*;
import java.util.*;
import java.io.*;

public class main {
	
	ArrayList<Primal> arrayP = new ArrayList<Primal>(); 
	ArrayList<TransClass> arrayT = new ArrayList<TransClass>();
	WeightMenu weightmenu = new WeightMenu();
	TransArray transarray = new TransArray();
	MainMenu mainmenu = new MainMenu();
	OutputFile outputfile= new OutputFile();

	public static void main(String[] args) {
		new main();
	}//end main function
		
	public main() {
		/*arrayP.add(new Skirt());	
		arrayP.add(new BeefStew());
		Primal meat = arrayP.get(0);
		Primal meat1 = arrayP.get(1);
		arrayT.add(new TransClass(meat, 9.00, true, 10001));
		arrayT.add(new TransClass(meat1, 14.00, true, 10002));
		*/
		mainmenu.Populate(arrayP);
		
		int option = 0;
		boolean keepGoing = true;
		int codeInput = 0;
		double weightInput = 0.00;
		int transID = 10003;
		int tempID = 0;

		System.out.println("Welcome to the Meat Inventory System.");
		
		while(keepGoing) {
			System.out.println("What would you like to do?");
			System.out.println("1) Enter meat into inventory\t2) Cancel a transaction\t3) Transfer into RTC\t4) Output File\t5) Exit");

		option = mainmenu.GetOption(1, 5);
		
		if(option == 1) {
			mainmenu.EnterIntoInventory(arrayP, arrayT, weightmenu, transID);
		}
		if(option == 2) {
			transarray.ListAll(arrayT);
			tempID = weightmenu.GetTransID();
			transarray.RemoveTrans(arrayT, arrayP, tempID, weightmenu);
		}			
		if(option == 3) {
			;//add this once meats are done
		}
		if(option == 4) {
			System.out.println("Which file would you like to view?");
			System.out.println("1) Current Inventory\t2) Transactions\t3) Return to main menu");
			option = mainmenu.GetOption(1, 3);
			outputfile.DoOption(option, arrayT, arrayP);		
		}
		if(option == 5) 
			keepGoing = false;	
		}//end while
	}//end constructor

}//end mainClass
