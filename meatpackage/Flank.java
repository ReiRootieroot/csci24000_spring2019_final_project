//Flank.java

package meatpackage;

public class Flank extends Primal {

	public Flank() {
		super.type = MeatType.Flank;
		super.meatCat = MeatCategory.Thin;
		super.dryAged = false;
		super.code = 94036;
		this.priceSold = 14.99;
		super.weightInv = 0.00;
		super.name = "Flank Primal";
		super.needTrim = false;
	}//end constructor

}//end Flank
