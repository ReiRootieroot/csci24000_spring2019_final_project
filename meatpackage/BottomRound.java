//BottomRound.java

package meatpackage;

public class BottomRound extends Primal {

	protected double weightTrim;

	public Skirt() {
		super.type = MeatType.Bottom;
		super.meatCat = MeatCategory.Round;
		super.dryAged = false;
		super.code = 92301;
		this.priceSold = 7.99;
		super.weightInv = 0.00;
		super.name = "Bottom Round Primal";
		super.needTrim = true;
		super.weightTrim = 0.00;
	}//end constructor

}//end Skirt
