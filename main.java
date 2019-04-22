//main.java

import meatpackage.*;
import java.util.*;

public class main {
	
	ArrayList<Primal> array = new ArrayList<Primal>(); 

	public static void main(String[] args) {
		new main();
	}//end main function
		
	public main() {
		Primal meat = new Skirt();
		array.add(meat);	

		System.out.println(array.get(0).ifGrassFed());
	}//end constructor

}//end mainClass
