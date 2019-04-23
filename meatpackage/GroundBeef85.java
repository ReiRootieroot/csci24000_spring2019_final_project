//GroundBeef85.java

package meatpackage;

public class GroundBeef85 extends Chuck {

	protected int perc;

	public GroundBeef85() {
		super.type = MeatType.Chuck;
		super.meatCat = MeatCategory.Middle;
		super.dryAged = false;
		super.code = 95767;
		this.priceSold = 4.99;
		super.weightInv = 0.00;
		super.name = "85% Ground Beef";
		super.needTrim = true;
		super.weightTrim = 0.00;
		this.perc = 85;
	}//end constructor

}//end Brisket
