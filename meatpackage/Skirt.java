//Skirt.java

package meatpackage;

public class Skirt extends Primal {

	public Skirt(MeatType type, MeatCategory meatCat) {
		super.type = type;
		super.meatCat = meatCat;
		System.out.println(type + "\n" + meatCat);
	}//end constructor

}//end Skirt
