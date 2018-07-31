package sample.com.java.sample;

import java.util.Scanner;

public class CharCountWithoutUsingLoop {
	public static void main(String args[])
	{
		System.out.println("enter the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("enter the Character:");
		String str1=sc.next();
		//String ch=str1.charAt(0);
		int leng = str.length()-str.replaceAll(str1, "").length();
		int length=str.length()-leng;
		System.out.println("The entered character occurence is:"+leng);
		
	}

}
