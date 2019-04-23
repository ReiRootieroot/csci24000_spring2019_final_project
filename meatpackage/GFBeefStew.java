//BeefStew.java

package meatpackage;

public class BeefStew extends BottomRound {

	public BeefStew() {
		super.type = MeatType.Bottom;
		super.meatCat = MeatCategory.Round;
		super.dryAged = false;
		super.code = 98041;
		this.priceSold = 6.99;
		super.weightInv = 0.00;
		super.name = "Beef Stew";
		super.needTrim = false;
		super.weightTrim = 0.00;
	}//end constructor

}//end BeefStew
