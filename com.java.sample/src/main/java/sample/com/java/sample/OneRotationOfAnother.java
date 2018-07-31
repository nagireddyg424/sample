package sample.com.java.sample;

import java.util.Scanner;

public class OneRotationOfAnother {
public static void main(String args[])
{
	System.out.println("enter the first String:");
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	System.out.println("enter the another String:");
	String s2=sc.nextLine();
	if(s1.length()!=s2.length())
	{
		System.out.println("Second String is not a rotation of first String:");
	}
	else
	{
		String s3=s1+s1;
		if(s3.contains(s2))
		{
			System.out.println("The second String is rotation of first String");
		}
		else
		{
			System.out.println("Second String is not a rotation of first String in else");
		}
	}
}
}
