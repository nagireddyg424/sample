package sample.com.java.sample;

import java.util.Scanner;

public class RemoveWhiteSpaces {
	public static void main(String args[])
	{
		int i;
		System.out.println("enter the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//below two steps first method
		//String str1=str.replaceAll("\\s", "");
		//System.out.println("After removing whitespaces string is:"+str1);
		//below second method
		StringBuffer stb=new StringBuffer();
		char ch[]=str.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ' && ch[i]!='\t')
			{
				stb.append(ch[i]);
			}
		}
		System.out.println("after removing spaces in string:"+stb);
	}

}
