//main.java

import meatpackage.*;
import menupackage.*;
import transpackage.*;
import java.util.*;
import java.io.*;

public class main implements Serializable{
	
	ArrayList<Primal> arrayP = new ArrayList<Primal>(); 
	ArrayList<TransClass> arrayT = new ArrayList<TransClass>();
	WeightMenu weightmenu = new WeightMenu();
	TransArray transarray = new TransArray();
	MainMenu mainmenu = new MainMenu();
	OutputFile outputfile= new OutputFile();
	

	public static void main(String[] args) {
		new main();
	}//end main function
		
	public main() {
		


		//Initialize elements in the array
                arrayP.add(new BottomRound());
                arrayP.add(new BeefStew());
                arrayP.add(new Brisket());
                arrayP.add(new Chuck());
                arrayP.add(new DARibeyeBless());
                arrayP.add(new Flank());
		arrayP.add(new NY());
		arrayP.add(new RibeyeBI());
		arrayP.add(new RibeyeBless());
		arrayP.add(new ShortRibs());
		arrayP.add(new CrossCut());
		arrayP.add(new Skirt());
		arrayP.add(new Top());
		arrayP.add(new DANY());
		arrayP.add(new Tenderloin());
		arrayP.add(new GroundBeef85());
		arrayP.add(new GFGroundBeef90());
		arrayP.add(new GFTop());
		arrayP.add(new GFRibeyeBless());


		mainmenu.UserSerial(arrayP, arrayT,weightmenu);

		/*
		try {
                        FileInputStream file = new FileInputStream("SavedArrayP.txt");
                        ObjectInputStream in = new ObjectInputStream(file);

                        arrayP = (ArrayList<Primal>)in.readObject();

                        in.close();
                        file.close();

                } catch(IOException e) {
                        System.out.println(e);
                } catch(ClassNotFoundException ex) {
                        System.out.println(ex);
                }//
	
		try {
                        FileInputStream file = new FileInputStream("SavedArrayT.txt");
                        ObjectInputStream in = new ObjectInputStream(file);

                        arrayT = (ArrayList<TransClass>)in.readObject();

                        in.close();
                        file.close();

                } catch(IOException e) {
                        System.out.println(e);
                } catch(ClassNotFoundException ex) {
                        System.out.println(ex);
                }//*/
			
		int option = 0;
		boolean keepGoing = true;
		int codeInput = 0;
		double weightInput = 0.00;
		int transID = 10003;
		int tempID = 0;
		
		//ACTUAL START
		System.out.println("Welcome to the Meat Inventory System.");
		
		while(keepGoing) {
			System.out.println("What would you like to do?");
			System.out.println("1) Enter meat into inventory\t2) Cancel a transaction\t3) Output File\t4) Exit");

			option = mainmenu.GetOption(1, 4);
		
			if(option == 1) {
				mainmenu.EnterIntoInventory(arrayP, arrayT, weightmenu, transID);
			}
			if(option == 2) {
				transarray.ListAll(arrayT);
				tempID = weightmenu.GetTransID();
				transarray.RemoveTrans(arrayT, arrayP, tempID, weightmenu);
			}			
			if(option == 3) {
				System.out.println("Which file would you like to view?");
				System.out.println("1) Current Inventory\t2) Transactions\t3) Return to main menu");
				option = mainmenu.GetOption(1, 3);
				outputfile.DoOption(option, arrayT, arrayP);		
			}
			if(option == 4) { 
				try {
					FileOutputStream file = new FileOutputStream("SavedArrayP.txt");
					ObjectOutputStream out = new ObjectOutputStream(file);

					out.writeObject(arrayP);
				
					out.close();
					file.close();
				
				} catch (IOException e) {
					System.out.println(e);
				}

				try {
        	                        FileOutputStream file = new FileOutputStream("SavedArrayT.txt");
        	                        ObjectOutputStream out = new ObjectOutputStream(file);

	                                out.writeObject(arrayT);
	
	                                out.close();
                                	file.close();
                        	} catch (IOException e) {
                                	System.out.println(e);
				}

				keepGoing = false;
			}
		}//end while
	}//end constructor

}//end mainClass
