package sample.com.java.sample;

import java.util.Scanner;

public class ReverseString {
public static void main(String args[])
{
	int i;
	String str1="";
	System.out.println("enter the String:");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	char ch[]=str.toCharArray();
	for(i=ch.length-1;i>=0;i--)
	{
		str1=str1+ch[i];
	}
	System.out.println("The given String after Reverse:"+str1);
}
}
