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

	public TransClass(Primal meat, double weight, boolean remove) {
		this.meat = meat;
		this.weight = weight;
		this.remove = remove;
	}//end constructor

	public void ListTrans() {
		System.out.print(this.meat.GetItemCode() + "\t");
                System.out.print(this.meat.GetName() + "\t");
                System.out.print(this.weight + "\t");
                System.out.print(cal.getTime() + "\n");
	}//end ListTrans

	public void WriteTrans(PrintWriter output) {
		
	 	output.print(this.meat.GetItemCode() + "\t");
		output.print(this.meat.GetName() + "\t");
		output.print(this.weight + "\t");
		output.print(cal.getTime() + "\n");
	}//end WriteTrans

	public void SetEnterRemove(boolean remove) {
		this.remove = remove;
	}//end SetEnterRemove
	
	public boolean GetEnterRemove() {
		return this.remove;
	}//end GetEnterRemove
}//end TransClass
