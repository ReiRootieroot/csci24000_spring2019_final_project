//Sirloin.java

package meatpackage;

public class Sirloin extends Top {

	public Sirloin() {
		super.type = MeatType.Top;
		super.meatCat = MeatCategory.GrassFed;
		super.dryAged = false;
		super.code = 95151;
		this.priceSold = 12.99;
		super.weightInv = 0.00;
		super.name = "Grass-Fed Sirloin Steak";
		super needTrim = false;
	}//end constructor

}//end Sirloin
