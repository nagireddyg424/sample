package sample.com.java.sample;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedAndNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		FirstRepeatedAndNonRepeated(s1);
	}
	public static void FirstRepeatedAndNonRepeated(String str)
	{
		HashMap<Character, Integer> hmap=new HashMap<Character,Integer>();
		char ch[]=str.toCharArray();
		for(char chr:ch)
		{
			if(hmap.containsKey(chr))
			{
				hmap.put(chr, hmap.get(chr)+1);
			}
			else
			{
				hmap.put(chr, 1);
			}
		}
		
		for(char ch1:ch)
		{
			if(hmap.get(ch1)==1)
			{
				System.out.println("The Non Repeated Character is:"+ch1);
				break;
			}
		}
		
		for(char ch2:ch)
		{
			if(hmap.get(ch2)>1)
			{
				System.out.println("The Repeated Character is:"+ch2+" "+hmap.get(ch2));
				break;
			}
		}
	}

}
