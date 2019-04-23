//TransArray.java

package transpackage;
import meatpackage.*;
import java.util.*;
import java.io.*;

public class TransArray {

	public TransArray() {
		;
	}//end constructor

	public void ListAll(ArrayList<TransClass> array) {
		int length = array.size();
		int counter = 0;
		
		if(length < 10)
			counter = length;
		else
			counter = length-10;

		for(int i = counter; i < length; i++) {
			array.get(i).ListTrans();
		}//end for		
	}//end ListAll

	public void RemoveTrans(ArrayList<TransClass> arrayT, ArrayList<Primal> arrayP) {

	}//end RemoveTrans
	
}//end TransArray
