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
		
		weightmenu.GetInput();
	}//end constructor

}//end mainClass
