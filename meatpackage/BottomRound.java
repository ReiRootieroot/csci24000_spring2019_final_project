//BottomRound.java

package meatpackage;

public class BottomRound extends Primal {

	protected double weightTrim;

	public BottomRound() {
		super.type = MeatType.Bottom;
		super.meatCat = MeatCategory.Round;
		super.dryAged = false;
		super.code = 92301;
		this.priceSold = 7.99;
		super.weightInv = 0.00;
		super.name = "Bottom Round Primal";
		super.needTrim = false;
		this.weightTrim = 0.00;
	}//end constructor

}//end BottomRound
