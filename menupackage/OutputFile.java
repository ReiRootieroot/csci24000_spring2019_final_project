//OutputFile.java

package menupackage;
import meatpackage.*;
import transpackage.*;
import java.util.*;
import java.io.*;

public class OutputFile {

	public void DoOption(int option, ArrayList<TransClass> arrayT, ArrayList<Primal> arrayP) {
		int length = arrayP.size();
		
		if(option == 1) {
		
			for(int i = 0; i < length; i++)
				arrayP.get(i).ListPrimal();
	
			try {
				FileWriter outFile = new FileWriter("CurrentInv.txt");
				PrintWriter output = new PrintWriter(outFile);
				for(int i = 0; i < length; i++) {
					arrayP.get(i).WritePrimal(output);	
				}//end for

				outFile.close();
                        	output.close();
				System.out.println("Inventory has been printed to CurrentInv.txt.");
			} catch (IOException e) {
				System.out.println("File not found");
			}//end trycatch
		}
		if(option == 2) {
			for(int i = 0; i < length; i++)
                                arrayT.get(i).ListTrans();

                        System.out.println("Transactions was printed to HistoryTrans.txt");
		}
		if(option == 3)
			; //do nothing
	}//end DoOption
}//end OutputFile
