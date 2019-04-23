//Chuck.java

package meatpackage;

public class Chuck extends Primal {

	protected double weightTrim;
 
	public Chuck() {
		super.type = MeatType.Chuck;
		super.meatCat = MeatCategory.Chuck;
		super.dryAged = false;
		super.code = 98077;
		this.priceSold = 6.99;
		super.weightInv = 0.00;
		super.name = "Chuck Primal";
		super.needTrim = false;
		this.weightTrim = 0.00;
	}//end constructor

}//end Chuck
