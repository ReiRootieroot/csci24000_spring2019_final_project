//GFGroundBeef90.java

package meatpackage;

public class GFGroundBeef90 extends Chuck {
	
	protected int perc;//percentage
 
	public GFGroundBeef90() {
		super.type = MeatType.Chuck;
		super.meatCat = MeatCategory.GrassFed;
		super.dryAged = false;
		super.code = 95997;
		this.priceSold = 7.99;
		super.weightInv = 0.00;
		super.name = "90% Grass-Fed Ground Beef";
		super.needTrim = true;
		super.weightTrim = 0.00;
		this.perc = 90;
	}//end constructor

}//end GFGroundBeef90
