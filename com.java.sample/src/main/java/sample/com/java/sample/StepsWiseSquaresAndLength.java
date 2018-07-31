package sample.com.java.sample;

public class StepsWiseSquaresAndLength {
	public static void main(String args[])
	{
		int value=16;
		int i=1;
		while(i>0)
		{
		int result=getValue(i);
		if(value==result)
		{
			System.out.println(i);
			break;
		}
		else if(result>value)
		{
			System.out.println(i-1);
			break;
		}
		else
		{
			i++;
		}
		}
		
	}
	public static int getValue(int n)
	{
		return n*(n+1)/2;
	}

}
