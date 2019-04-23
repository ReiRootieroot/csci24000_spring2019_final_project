//Brisket.java

package meatpackage;

public class Brisket extends Primal {
 
	public Brisket() {
		super.type = MeatType.Brisket;
		super.meatCat = MeatCategory.Chuck;
		super.dryAged = false;
		super.code = 94746;
		this.priceSold = 9.99;
		super.weightInv = 0.00;
		super.name = "Brisket Primal";
		super.needTrim = false;
	}//end constructor

}//end Brisket
