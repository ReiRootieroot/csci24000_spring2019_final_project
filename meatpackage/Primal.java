//Primal.java

package meatpackage;
import java.util.*;
import java.io.*;

public abstract class Primal implements Serializable {

	protected MeatType type;
	protected MeatCategory meatCat;
	protected boolean dryAged;
	protected double weightInv;
	protected double priceBought;
	protected double priceSold;
	protected int code;
	protected String name;

	Primal() {
		type = MeatType.Bottom;
		meatCat = MeatCategory.Thin;
		dryAged = false;
		weightInv = 0.00;
		priceBought = 0.00;
		priceSold = 0.00;
		code = 00000;
		name = "";
	}//end constructor

	public void AddWeight(double weight) {
		this.weightInv += weight;
	}//end addWeight

	public void SubtractWeight(double weight) {
		this.weightInv -= weight;
	}//end subtractWeight	
	
	public double GetWeight() {
		return this.weightInv;
	}//end getWeight

	public boolean IfGrassFed() {
		if (this.meatCat == MeatCategory.GrassFed)
			return true;
		else
			return false;
	}//end ifGrassFed

	public void SetDryAged() {
		this.dryAged = true;
	}//end setDryAged

	public String GetName() {
		return this.name;
	}//end GetName

	public int GetItemCode() {
		return this.code;
	}//end GetItemCode

	public void WritePrimal(PrintWriter output) {

		output.print(this.code + "\t");
		output.print(this.name + "\t");
		output.print(this.weightInv + "\t");
		output.print(this.type + "\t");
		output.print(this.priceBought + "\n");
	
	}//end WritePrimal
}//end Primal
