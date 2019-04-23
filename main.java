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

	public static void main(String[] args) {
		new main();
	}//end main function
		
	public main() {
		arrayP.add(new Skirt());	
		arrayP.add(new BeefStew());
		Primal meat = arrayP.get(0);
		Primal meat1 = arrayP.get(1);
		arrayT.add(new TransClass(meat, 9.00, true));
		arrayT.add(new TransClass(meat1, 14.00, true));

		transarray.ListAll(arrayT);

		/*
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
		
		
	}//end constructor

}//end mainClass
