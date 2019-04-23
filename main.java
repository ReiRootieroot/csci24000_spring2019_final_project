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

	public static void main(String[] args) {
		new main();
	}//end main function
		
	public main() {
		arrayP.add(new Skirt());	
		arrayP.add(new BeefStew());
		Primal meat = arrayP.get(0);
		Primal meat1 = arrayP.get(1);
		arrayT.add(new TransClass(meat, 9.00, true, 10001));
		arrayT.add(new TransClass(meat1, 14.00, true, 10002));

		int option = 0;
		boolean keepGoing = true;

		System.out.println("Welcome to the Meat Inventory System.");
		
		while(keepGoing) {
			System.out.println("What would you like to do?");
			System.out.println("1) Enter meat into inventory\t2) Cancel a transaction\t3) Transfer into RTC\t4) Output File\t5) Exit");

		option = mainmenu.GetOption(1, 5);
		keepGoing = false;
		/*
		try {
			FileWriter outFile = new FileWriter("CurrentInv.txt");
			PrintWriter output = new PrintWriter(outFile);

			arrayP.get(0).WritePrimal(output);
		
			outFile.close();
			output.close();
		} catch (IOException e) {
			System.out.println("bahhumgub");
		}

		
		
		transarray.ListAll(arrayT);
		transarray.RemoveTrans(arrayT, arrayP, 10001);
		System.out.println();
		transarray.ListAll(arrayT);

		try {	
			FileWriter outFile = new FileWriter("HistoryTrans.txt"); //add ",true" to append;
			PrintWriter output = new PrintWriter(outFile);
		int a = array.get(0).GetItemCode();
		double weight = array.get(0).GetWeight();
		String name = array.get(0).GetName();
		String blah = "Item Code: " + a + ", (" + name + "), Weight: " + weight;
		weightmenu.Validate(blah);
	
		
			TransClass test = new TransClass(array.get(0), 2.00);
			test.WriteTrans(output);
			outFile.close();
			output.close();
		} catch(IOException e) {
			System.out.println("Yall dumb");
		}*/
		
		}//end while
	}//end constructor

}//end mainClass
