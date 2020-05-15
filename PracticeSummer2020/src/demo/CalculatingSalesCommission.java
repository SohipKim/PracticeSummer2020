package demo;


import java.util.Scanner;
//import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CalculatingSalesCommission {
	
	public static void main (String[] args)
	{
		String name = "";
		double sales = 0;
		double advancedPay = 0;
		int isForVaild = 1;
		double commission = 0;
		double check = 0;
		
		Scanner inputDevice = new Scanner(System.in);
		//DecimalFormat dollar = new DecimalFormat();
		NumberFormat Currency = NumberFormat.getCurrencyInstance(Locale.CANADA);
		Currency.setMaximumFractionDigits(0);
		
		System.out.println("Enter the name of employee: ");
		name = inputDevice.nextLine();
		
		System.out.println("Enter the amount of monthly sales: $");
		sales = inputDevice.nextInt();
		
		while (isForVaild == 1)
		{
			System.out.println("Enter the amount of advanced pay: $ ");
			advancedPay = inputDevice.nextInt();
			
		if(advancedPay <= 1500)
		{
			isForVaild = 0;
		}
		else 
		{
			System.out.println("advanced pay must be lesst than" + Currency.format(1500));
		}
		
		}
		
		if(sales >= 0 && sales < 10000 )		
		{
			commission = sales*0.05;
		}
		else if(sales >= 10000 && sales <15000)
		{
			commission = sales*0.1;
		}
		else if(sales >= 15000 && sales < 18000)
		{
			commission = sales*0.12;
		}
		else if(sales >= 18000 && sales < 22000)
		{
			commission = sales*0.15;
		}
		else
		{
			commission = sales*0.16;
		}
		
		check = commission-advancedPay; 
		
		//String commissionNew = String.format("$%,d", commission);
		
		System.out.println("Here is the output:");
		
		System.out.printf(name + "'s commission is " + Currency.format(commission) +". " + name + " took " + Currency.format(advancedPay)+
				" in advance pay. At the end of the month, " + name + " gets a check for " + Currency.format(check)+".");
		
		/*System.out.printf(name + " 'scommission is %,3d%n." + name + " took %,3d%n in advance pay. "
			+ "At the end of the month," +name +" gets a check for %,3d%n", commission, advancedPay, check);
	
		
			
		/*System.out.println(name + "s commission is " + String.format("%,d", commission) +". " + name + " took " + advancedPay+
				" in advance pay. At the end of the month, " + name + " gets a check for " + check);
		*/
		 
	}
	
	

}
