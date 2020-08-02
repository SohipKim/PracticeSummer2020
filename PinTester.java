package PinTester;

public class PinTester {
	
	private final int[] VALID_NUMS = {2,4,1,8};
	private int[] userPinsArry=null;

public PinTester(int[] userPinsArry) 
{ 
	this.userPinsArry=userPinsArry;
}

public void test() {
	int count = 0;
	
	for(int i=0; i <4 ; i++)		
	{
		if(VALID_NUMS[i] == userPinsArry[i])
		{
			count++;
		}	
	}
	if(count==4)
		System.out.println("SUCCESS: Your PIN is valid" );
		
	else
		System.out.println( "FAIL: Your PIN is not valid" );
	
}
}
