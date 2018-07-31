package sample.com.java.sample;

import java.util.Scanner;

public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,index;
		boolean flag=true;
		System.out.println("enter the first String:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		System.out.println("enter the second String:");
		String s2=sc.nextLine();
		
		if(s1.length()!=s2.length())
		{
			flag=false;
		}
		else
		{
			for(char cha:ch)
			{
				index=s2.indexOf(cha);
				
				if(index!=-1)
				{
					s2=s2.substring(0,index)+s2.substring(index+1,s2.length());
				}
				else
				{
					flag=false;
					 break;
				}
			}
			
		}
		if(flag)
		{
			System.out.println("The given strings are anagram:");
		}
		else
		{
			System.out.println("The given Strings are not anagram:");
		}

	}

}
