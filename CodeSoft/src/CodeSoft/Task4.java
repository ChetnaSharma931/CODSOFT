package CodeSoft;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		double amount, camount=0;
		String bcurrency, tcurrency;
		Scanner S1 = new Scanner(System.in);
		
		double INRToUSD = 0.85;
		double INRToEUR = 0.88;
		double INRToJPU = 0.99;
		double USDToEUR = 0.77;
		double USDToJPU = 0.66;
		double JPUToEUR = 0.94;
		
		System.out.print("Welcome to Currency Exchanger");
		
		System.out.print("\nEnter the Base Currency (Eg: INR, USD, EUR, JPU)");
		bcurrency= S1.nextLine().toUpperCase();
		
		System.out.print("\nEnter the Targeted Currency (Eg: INR, USD, EUR, JPU)");
		tcurrency= S1.nextLine().toUpperCase();
		
		System.out.print("\n Enter the Amount in the Base Currency");
		amount= S1.nextDouble();
		
		if(bcurrency.equals("INR") && tcurrency.equals("USD")) {
			camount= amount* INRToUSD;
			System.out.println(amount + " " + bcurrency + " is equal to " + camount + " " + tcurrency);
		}
		
		else if(bcurrency.equals("USD") && tcurrency.equals("INR")) {
			camount= amount/ INRToUSD;
			System.out.println(amount + " " + bcurrency + " is equal to " + camount + " " + tcurrency);
		}
		
		else if(bcurrency.equals("INR") && tcurrency.equals("EUR")) {
			camount= amount* INRToEUR;
			System.out.println(amount + " " + bcurrency + " is equal to " + camount + " " + tcurrency);
		}
		
		else if(bcurrency.equals("EUR") && tcurrency.equals("INR")) {
			camount= amount/ INRToEUR;
			System.out.println(amount + " " + bcurrency + " is equal to " + camount + " " + tcurrency);
		}
		
		else if(bcurrency.equals("INR") && tcurrency.equals("JPU")) {
			camount= amount* INRToJPU;
			System.out.println(amount + " " + bcurrency + " is equal to " + camount + " " + tcurrency);
		}
		
		else if(bcurrency.equals("JPU") && tcurrency.equals("INR")) {
			camount= amount/ INRToJPU;
			System.out.println(amount + " " + bcurrency + " is equal to " + camount + " " + tcurrency);
		}
		
		else if(bcurrency.equals("USD") && tcurrency.equals("EUR")) {
			camount= amount* USDToEUR;
			System.out.println(amount + " " + bcurrency + " is equal to " + camount + " " + tcurrency);
		}
			
		else if(bcurrency.equals("EUR") && tcurrency.equals("USD")) {
				camount= amount/ USDToEUR;
				System.out.println(amount + " " + bcurrency + " is equal to " + camount + " " + tcurrency);
		}
		
		else if(bcurrency.equals("USD") && tcurrency.equals("JPU")) {
				camount= amount* USDToJPU;
				System.out.println(amount + " " + bcurrency + " is equal to " + camount + " " + tcurrency);
		}
		
		else if(bcurrency.equals("JPU") && tcurrency.equals("USD")) {
				camount= amount/ USDToJPU;
				System.out.println(amount + " " + bcurrency + " is equal to " + camount + " " + tcurrency);
		}
		
		else if(bcurrency.equals("JPU") && tcurrency.equals("EUR")) {
				camount= amount* JPUToEUR;
				System.out.println(amount + " " + bcurrency + " is equal to " + camount + " " + tcurrency);
		}
		
		else if(bcurrency.equals("EUR") && tcurrency.equals("JPU")) {
				camount= amount/ JPUToEUR;
				System.out.println(amount + " " + bcurrency + " is equal to " + camount + " " + tcurrency);
		}
		else
		{
			System.out.print("\nYou have entered invalid Value");
		}
	}

	
		
		
		
		
		

	





	}


