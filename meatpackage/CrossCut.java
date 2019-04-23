//CrossCut.java

package meatpackage;

public class CrossCut extends ShortRibs {
 
	public CrossCut() {
		super.type = MeatType.ShortRibs;
		super.meatCat = MeatCategory.Offal;
		super.dryAged = false;
		super.code = 94935;
		this.priceSold = 8.99;
		super.weightInv = 0.00;
		super.name = "Cross-Cut Short Ribs";
		super.needTrim = true;
	}//end constructor

}//end CrossCut
