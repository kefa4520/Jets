package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AirField {
	private List<Jet> jets;
    Scanner sc = new Scanner(System.in);
    
	public AirField(String jetFile) {
		jets = readFromText(jetFile);
	}

	public void displayJets() {
		for (Jet jet : jets) {
		    if (jet != null) {
		System.out.println(jet);
		    }
		}
	
	}
	public void loadDusty() {
		for(int i= 0; i <jets.size(); i++) {
			     if (jets.get(i) instanceof DustyCrophopper) { // 
				((DustyCrophopper) jets.get(i)).cropdusting();    //((DustyCrophopper) jets).cropdusting();	
			}
		}
	
	}
	
	public void raceIshani() {
		for(int i= 0; i <jets.size(); i++) {
			if (jets.get(i) instanceof Ishani) {
				((Ishani) jets.get(i)).race();
				
			}
		}
	}

	public void flyJets() {
		for (int i = 0; i < jets.size(); i++) {
//			if (jets instanceof DustyCrophopper) {
//				((DustyCrophopper) jets).fly();
//			}
//			if (jets instanceof Ishani) {
//				((Ishani) jets).fly();
//			}
//			if (jets instanceof JetImpl) {
//				((JetImpl) jets).fly();
//			}
			jets.get(i).fly();
		}

	}
	public void fastestJet() {
		Jet compare = jets.get(0);
		double fastest = jets.get(0).getSpeed();
		for (int i=0; i<jets.size(); i++) {
			if(jets.get(i)!=null) {
				if(fastest < jets.get(i).getSpeed()) {
					fastest = jets.get(i).getSpeed();
					compare = jets.get(i);
				}
			}
		} System.out.println("The following jet has the fastest speed: " + compare.toString());
		System.out.println();
	}
	
	public void longestRange() {
		Jet letsCompare = jets.get(0);
		int longest = jets.get(0).getRange();
		for (int i=0; i<jets.size(); i++) {
			if(jets.get(i)!=null) {
				if(longest < jets.get(i).getRange()) {
				   longest = jets.get(i).getRange();
				   letsCompare = jets.get(i);
				}
			}
		}System.out.println("Jet with the longest range is: " + letsCompare.toString());
		System.out.println();
	}
		
		
		
		
		
		
//			Double max = (Double)jets.get(3);
//			Jet compare = 
//			for (int i =0; i<jets.size(); i++) {
//		}
	
		

	public void removeJet() {
		
		int counter = -1;
		for (Jet jet : jets) {
			counter++;
			System.out.println(counter + " " +jet);
		} 
			System.out.println("Pick a number of the jet you would like to remove");
			int option = sc.nextInt();
		    jets.remove(option);
		    System.out.println("Heres the updated list");
		    displayJets();
		
	}
	

	private List<Jet> readFromText(String jetFile) {
		List<Jet> jets = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader(jetFile))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetRecord = line.split(", ");
				String model = jetRecord[0];
				String name = jetRecord[1];
				double speed = Double.parseDouble(jetRecord[2]);
				int range = Integer.parseInt(jetRecord[3]);
				long price = Long.parseLong(jetRecord[4]);

				if (model.equals("DustyCrophopper")) {
					
					jets.add(new DustyCrophopper(model, name, speed, range, price));
				}
				if (model.equals("Ishani")) {
					Jet racer = new Ishani(model, name, speed, range, price);
					jets.add(racer);
				}
				if (model.equals("Drone")) {
                    Jet j = new Jet(model, name, speed, range, price);
				// System.out.println(j);
				    jets.add(j);
				}
				
				else {
					continue;
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return jets;
	}

	public void addJets() { //Jet newJet
		System.out.println("Enter speed in MPH: ");
		double speed = sc.nextDouble();
		System.out.println("Enter range distance in miles: ");
		int range = sc.nextInt();
		System.out.println("Enter price in $: ");
		long price = sc.nextLong();
		sc.nextLine();
		
		Jet jetByUser = new JetImpl(speed, range, price);
		jets.add(jetByUser);
		
	}
}
