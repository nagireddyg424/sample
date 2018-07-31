package sample.com.java.sample;

import java.util.Scanner;

public class NumberOfWords {
	public static void main(String args[])
	{
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String words[]=str.split(" ");
		System.out.println("The given string lenght is:"+words.length);
	}

}
