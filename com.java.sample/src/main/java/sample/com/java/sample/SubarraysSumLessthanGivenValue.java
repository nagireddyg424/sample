package sample.com.java.sample;

public class SubarraysSumLessthanGivenValue {
	public static void main(String args[])
	{
		int a[]={1,2,3,5,7,9};
		int len=a.length;
		int i=0,j,product,k=10,count=0;
		while(i<len)
		{
			if(a[i]<k)
			{
				j=i;
				product=a[i];
				while(product<k)
				{
					print(a,j,i);
					count++;
					j--;
					if(j<0)
					{
						break;
					}
					else
					{
					product*=a[j];
					}
				}
			}
			i++;
		}
		
	}
	public static void print(int a[],int j, int i)
	{
		System.out.print("[");
		while(j<=i)
		{
			System.out.println("after i"+j+ "and"+i);
			System.out.print(a[j]);
			j++;
			
		}
		System.out.print("]");
		
	}

}
