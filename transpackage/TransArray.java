//TransArray.java

package transpackage;
import meatpackage.*;
import java.util.*;
import java.io.*;

public class TransArray {

	public TransArray() {
		;
	}//end constructor

	public int ListAll(ArrayList<TransClass> arrayT) {
		int length = arrayT.size();
		int counter = 0;
		boolean GreaterThanTen = false;	
	
		if(length >= 10) {
			counter = length-10;
			GreaterThanTen = true;
		}

		for(int i = counter; i < length; i++) {
			arrayT.get(i).ListTrans();
		}//end for

		if(GreaterThanTen)
			return length-10;
		else
			return 0;
	}//end ListAll

	public void RemoveTrans(ArrayList<TransClass> arrayT, ArrayList<Primal> arrayP, int id) {
		int length = arrayT.size();
		int idArrayT = 0;
		int itemCode = 0;
		int codeCheck = 0;
		double weight = 0.00;
		boolean IDFound = false;
		boolean removeTrue = false; //check whether if meat was taken out from the inventory

		for(int i = 0; i < length; i++) {
			idArrayT = arrayT.get(i).GetID();

			if(idArrayT == id) {
				IDFound = true;
				itemCode = arrayT.get(i).GetItemCode();
				removeTrue = arrayT.get(i).GetEnterRemove();
				weight = arrayT.get(i).GetWeight();
				arrayT.remove(i);
				i = length; //stop for loop
			}
			else
				System.out.println("\nTransaction ID not found. Nothing was changed.");
		}//end for

		if(IDFound) {
			length = arrayP.size();
			
			for(int i = 0; i < length; i++) {
				codeCheck = arrayP.get(i).GetItemCode();
				
				if(codeCheck == itemCode) {			
					System.out.print("\nTransanction deleted. " + weight + " lb.");

					if(removeTrue) {				
						arrayP.get(i).AddWeight(weight);
						System.out.print(" added back into inventory.");
					}
					else {
						arrayP.get(i).SubtractWeight(weight);
						System.out.println(" subtracted from inventory.");
					}
					
					i = length; //stop for loop
				}//end if
				
			}//end for
		}//end if
	}//end RemoveTrans
	
}//end TransArray