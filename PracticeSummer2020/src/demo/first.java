package demo;
import java.util.Scanner;
public class first {
	
	public static void main (String[] args) {
		
		String name;
		int age;
		
		Scanner inputDevice = new Scanner(System.in);
	
		System.out.println("Please enter your name : ");
		name = inputDevice.nextLine();
		
		System.out.println("Please enter your age :");
		age = inputDevice.nextInt();
		
		System.out.println("Your name is " + name + "you are " + age + "years old.");
		
	}
	

}
