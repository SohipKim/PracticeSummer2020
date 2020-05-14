package demo;

import java.util.Scanner;
public class RestaurantSelector { 
	
		public static void main (String[] args)
		{
			
		String vegetarian;
		String vegan;
		String glutenFree;
		
		
		Scanner inputDevice = new Scanner(System.in);
		
		
		System.out.println("Is anyone in your party a vegetarian? (Yes/No)");
		 vegetarian = inputDevice.nextLine();	 	
		
		System.out.println("Is anyone in your party a vegan? (Yes/No)");
		vegan = inputDevice.nextLine();
		
		System.out.println("Is anyone in your party gluten-free? (Yes/No)");
		glutenFree = inputDevice.nextLine();
		
		
		System.out.println("Here are the restaurant choice(s):");
		
		
		if(glutenFree.equalsIgnoreCase("Yes"))
		{
			if(vegan.equalsIgnoreCase("Yes"))
			{
			System.out.println("Corner Café \nThe Chef’s Kitchen ");
			}			
			
			else 
			{
				System.out.println("Main Street Pizza Company \nCorner Café \nThe Chef’s Kitchen");	
			}
		}
		
		else
		{
			if(vegetarian.equalsIgnoreCase("No"))
			{
				System.out.println("Joe’s Gourmet Burgers");
			}
			else
			{	
				System.out.println("Mama Fine Italian");
			}
		}
		
		
	}
}
