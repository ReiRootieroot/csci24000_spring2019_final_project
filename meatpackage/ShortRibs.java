//ShortRibs.java

package meatpackage;

public class ShortRibs extends Primal {
 
	public ShortRibs() {
		super.type = MeatType.ShortRibs;
		super.meatCat = MeatCategory.Offal;
		super.dryAged = false;
		super.code = 94926;
		this.priceSold = 8.99;
		super.weightInv = 0.00;
		super.name = "Short Rib Primal";
		super.needTrim = false;
	}//end constructor

}//end ShortRibs
