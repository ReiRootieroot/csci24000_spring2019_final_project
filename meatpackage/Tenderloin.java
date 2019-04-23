//Tenderloin.java

package meatpackage;

public class Tenderloin extends Primal {

	public Tenderloin() {
		super.type = MeatType.Tenderloin;
		super.meatCat = MeatCategory.Middle;
		super.dryAged = false;
		super.code = 95929;
		this.priceSold = 29.99;
		super.weightInv = 0.00;
		super.name = "Tenderloin Primal";
		super.needTrim = false;
	}//end constructor

}//end Tenderloin
