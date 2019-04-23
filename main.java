//main.java

import meatpackage.*;
import menupackage.*;
import java.util.*;

public class main {
	
	ArrayList<Primal> array = new ArrayList<Primal>(); 
	WeightMenu weightmenu = new WeightMenu();

	public static void main(String[] args) {
		new main();
	}//end main function
		
	public main() {
		array.add(new Skirt());	
		array.add(new BeefStew());
	
		int a = array.get(0).GetItemCode();
		double weight = array.get(0).GetWeight();
		String name = array.get(0).GetName();
		String blah = "Item Code: " + a + ", (" + name + "), Weight: " + weight;
		weightmenu.Validate(blah);
	}//end constructor

}//end mainClass
