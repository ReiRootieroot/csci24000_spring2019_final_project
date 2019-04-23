//ShortRibs.java

package meatpackage;

public class ShortRibs extends Primal {

	protected double weightTrim;
 
	public ShortRibs() {
		super.type = MeatType.ShortRibs;
		super.meatCat = MeatCategory.Offal;
		super.dryAged = false;
		super.code = 94926;
		this.priceSold = 8.99;
		super.weightInv = 0.00;
		super.name = "Short Rib Primal";
		super.needTrim = false;
		this.weightTrim = 0.00;
	}//end constructor

}//end ShortRibs
