package sample.com.java.sample;

import java.util.Scanner;

public class ReverseWithPreservingPositionOfSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i,j;
		System.out.println("enter the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char inputStringArray[]=str.toCharArray();
		char[] outputArray=new char[inputStringArray.length];

		for(i=0;i<inputStringArray.length;i++)
		{
			if(inputStringArray[i]==' ')
			{
				outputArray[i]=' ';
			}
		}
		j=outputArray.length-1;
		
		for(i=0;i<inputStringArray.length;i++)
		{
			if(inputStringArray[i]!=' ')
			{
				if(outputArray[j]==' ')
				{
					j--;
				}
				outputArray[j]=inputStringArray[i];
				j--;
			}
		}
		System.out.println("The string is after reverse with preserving spaces:"+String.valueOf(outputArray));
	*/
		//another way
		int i=0;
		System.out.println("enter the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char in[]=str.toCharArray();
		int j=in.length-1;
		//for(i=0;i<in.length;i++)
		while(i<in.length && j>=0)
		{
			if(in[i]!=' ' && in[j]!=' ')
			{
				System.out.print(in[j]);
				i++;
				j--;
			}
			else if(in[i]==' ' && in[j]!=' ')
			{
				System.out.print(in[i]);
				i++;
			}
			else if(in[i]!=' ' && in[j]==' ')
			{
				j--;
			}
			else
			{
				System.out.print(in[i]);
				i++;
				j--;
			}
		}
		
	}
}
