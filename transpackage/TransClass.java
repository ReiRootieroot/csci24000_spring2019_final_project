//TransClass.java

package transpackage;
import meatpackage.*;
import java.util.*;
import java.io.*;

public class TransClass {

	Primal meat;
	double weight;
	Calendar cal = Calendar.getInstance();
	boolean remove;
	int id;

	public TransClass(Primal meat, double weight, boolean remove, int id) {
		this.meat = meat;
		this.weight = weight;
		this.remove = remove;
		this.id = id;
	}//end constructor

	public void ListTrans() {
		System.out.print(this.meat.GetItemCode() + "\t");
                System.out.print(this.id + "\t");
		System.out.print(this.meat.GetName() + "\t");
                
		if(remove)
			System.out.print("-");
		
		System.out.print(this.weight + "\t");
                System.out.print(cal.getTime() + "\n");
	}//end ListTrans

	public void WriteTrans(PrintWriter output) {
		
	 	output.print(this.meat.GetItemCode() + "\t");
		output.print(this.id + "\t");
		output.print(this.meat.GetName() + "\t");
		
		if(remove)
			output.print("-");
		
		output.print(this.weight + "\t");
		output.print(cal.getTime() + "\n");
	}//end WriteTrans

	public void SetEnterRemove(boolean remove) {
		this.remove = remove;
	}//end SetEnterRemove
	
	public boolean GetEnterRemove() {
		return this.remove;
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
