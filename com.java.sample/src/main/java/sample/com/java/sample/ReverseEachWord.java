package sample.com.java.sample;

import java.util.Scanner;

public class ReverseEachWord {
	public static void main(String args[])
	{
		int i,j;
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String words[]=str.split(" ");
		System.out.println(words.length);
		for(i=0;i<words.length;i++)
		{
			String str1=words[i];
			for(j=str1.length()-1;j>=0;j--)
			{
				System.out.print(str1.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
