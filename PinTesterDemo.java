package PinTester;

import java.util.*;
public class PinTesterDemo {

	public static void main (String[] args)
	{
		
	int[] userPinsArry = {0,0,0,0};
	
	try (Scanner Input = new Scanner(System.in)) {
		System.out.print("Enter the 4 digit PIN : ");	
			
			for(int i=0 ; i <4; i++ )
			{
				userPinsArry[i] = Input.nextInt();
			}
	}
	PinTester p = new PinTester(userPinsArry);
	p.test();

	}

}
