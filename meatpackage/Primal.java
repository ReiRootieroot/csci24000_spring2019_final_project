//Primal.java

package meatpackage;
import java.util.*;

public abstract class Primal implements java.io.Serializable {

	protected MeatType type;
	protected MeatCategory meatCat;
	protected boolean dryAged;
	protected boolean grassFed;
	protected double weightInv;
	protected double priceBought;
	protected double priceSold;
	protected int code;

	Primal() {
		type = MeatType.Bottom;
		meatCat = MeatCategory.Thin;
		dryAged = false;
		grassFed = false;
		weightInv = 0.00;
		priceBought = 0.00;
		priceSold =0.00;
		code = 00000;
	}//end constructor
	
}//end Primal
