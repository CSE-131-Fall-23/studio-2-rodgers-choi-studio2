package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your start amount?");
		double startAmount = in.nextDouble();
		
		System.out.println("How much money do you want at the end of your day?");
		double winLimit = in.nextDouble();
		
		System.out.println("How many number of days would you like to simulate?");
		int numDaysOfSimulations = in.nextInt();
		
		System.out.println("What is the probability that you win a single play?");
		double winChance = in.nextDouble();
		
		int numSimulations = 1;
		while (numSimulations <= numDaysOfSimulations){
		
			while (startAmount > 0 && startAmount < winLimit) {
				double probability = Math.random();
				if(probability <= winChance) {
					startAmount++;
					System.out.println("Simulation " + numSimulations + ": " + startAmount + "WIN");
				}
				else {
					startAmount--;
					System.out.println("Simulation " + numSimulations + ": " + startAmount + "LOSE");
				}
			}
			numSimulations++;
		}
		
		
	}//first thing --> do you have money between 0 and win limit (start amount)
	//random chance and gambling
	//add or subtract if win or lose
	//check to see if have money between 0 and win limit
	//if you hit 0 or hit win limit --> exit loop

}
