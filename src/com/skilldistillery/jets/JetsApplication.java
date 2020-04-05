package com.skilldistillery.jets;

import java.util.List;
import java.util.Scanner;

public class JetsApplication {
	 
	String jetFile = "JetsList.txt";
    AirField airField = new AirField(jetFile);
   
	public static void main(String[] args) {
		 JetsApplication fleet = new JetsApplication();
		 fleet.userMenu();
		

	}
	
	public void userMenu() {
		System.out.println("Welcome to the Jets Application");
		Scanner sc = new Scanner(System.in);
		
		int option = 0;
		
		do {
			System.out.println("Select from the following options: ");
			System.out.println("1.List fleet \n2.Fly all jets \n3.View fastest jet \n4.View jet with longest range");
			System.out.println("5.Load and Go \n6.Race! \n7.Add a jet to Fleet \n8.Remove a jet from Fleet");
			System.out.println("9.Quit");
			
			option = sc.nextInt();
			sc.nextLine();
			if(option == 9) {
				break;
			}
			if (option == 1) {
				airField.displayJets();
		
			}
			if(option == 2 ) {
				
				airField.flyJets();
			}
			if(option == 3) {
				airField.fastestJet();
			}
			if(option == 5) { 
				airField.loadDusty();
			}
			if(option == 6) {
				airField.raceIshani();
			}
			
			if (option == 7) {
				airField.addJets();
//				System.out.println("Enter model: ");
//				String model = sc.nextLine();
				
				//airField.addJets(new JetImpl(speed, range, price)); //add method to AirField that addsJets, pass info to the method in the Airfield
				
			}
			if (option == 8) {
				airField.removeJet();
			}
			
			
	} while (option != 9);
		System.out.println("Goodbye");

   }  
	
	
}

