//Primal.java

package meatpackage;
import java.util.*;

public abstract class Primal implements java.io.Serializable {

	protected MeatType type;
	protected MeatCategory meatCat;
	protected boolean dryAged;
	protected double weightInv;
	protected double priceBought;
	protected double priceSold;
	protected int code;

	Primal() {
		type = MeatType.Bottom;
		meatCat = MeatCategory.Thin;
		dryAged = false;
		weightInv = 0.00;
		priceBought = 0.00;
		priceSold = 0.00;
		code = 00000;
	}//end constructor

	public void addWeight(double weight) {
		this.weightInv += weight;
	}//end addWeight

	public void subtractWeight(double weight) {
		this.weightInv -= weight;
	}//end subtractWeight	
	
	public double getWeight() {
		return this.weightInv;
	}//end getWeight

	public boolean ifGrassFed() {
		if (this.meatCat == MeatCategory.GrassFed)
			return true;
		else
			return false;
	}//end ifGrassFed

	public void setDryAged() {
		this.dryAged = true;
	}//end setDryAged
}//end Primal
