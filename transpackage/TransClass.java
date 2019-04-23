//TransClass.java

package transpackage;
import meatpackage.*;
import java.util.*;
import java.io.*;

public class TransClass implements Serializable{

	Primal meat;
	double weight;
	Calendar cal = Calendar.getInstance();
	boolean addTrue;
	int id;

	public TransClass(Primal meat, double weight, boolean addTrue, int id) {
		this.meat = meat;
		this.weight = weight;
		this.addTrue = addTrue;
		this.id = id;
	}//end constructor

	public void ListTrans() {
		System.out.print(this.meat.GetItemCode() + "\t");
                System.out.print(this.id + "\t");
		System.out.print(this.meat.GetName() + "\t");
                
		if(addTrue)
			System.out.print("-");
		
		System.out.print(this.weight + "\t");
                System.out.print(cal.getTime() + "\n");
	}//end ListTrans

	public void WriteTrans() {
	
		try {
			FileWriter outFile = new FileWriter("HistoryTrans.txt");
			PrintWriter output = new PrintWriter(outFile);
	
		 	output.append(this.meat.GetItemCode() + "\t");
			output.append(this.id + "\t");
			output.append(this.meat.GetName() + "\t");
		
			if(!addTrue)
				output.append("-");
		
			output.append(this.weight + "\t");
			output.append(cal.getTime() + "\n");

			outFile.close();
			output.close();
		}catch (IOException e) {
			System.out.println("File not found.");
		}//end trycatch
	}//end WriteTrans
	
	public boolean GetEnterRemove() {
		return this.addTrue;
	}//end GetEnterRemove

	public int GetID() {
		return this.id;
	}//end GetID

	public int GetItemCode() {
		return this.meat.GetItemCode();
	}//end GetItemCode

	public double GetWeight() {
		return this.weight;
	}//end GetWeight
}//end TransClass
