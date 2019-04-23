//Chuck.java

package meatpackage;

public class Chuck extends Primal {
 
	public Chuck() {
		super.type = MeatType.Chuck;
		super.meatCat = MeatCategory.Chuck;
		super.dryAged = false;
		super.code = 98077;
		this.priceSold = 6.99;
		super.weightInv = 0.00;
		super.name = "Chuck Primal";
		super.needTrim = false;
	}//end constructor

}//end Chuck
