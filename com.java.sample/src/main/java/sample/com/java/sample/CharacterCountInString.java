package sample.com.java.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CharacterCountInString {
public static void main(String args[])
{
	Map<Character, Integer> map=new HashMap<Character,Integer>();
	System.out.println("enter the String:");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char ch[]=str.toCharArray();
	for(Character cha:ch)
	{
		if(map.containsKey(cha))
		{
			map.put(cha, map.get(cha)+1);
		}
		else
		{
			map.put(cha, 1);
		}
	}
	Set<Map.Entry<Character, Integer>> set=map.entrySet();
	for(Map.Entry<Character, Integer> entry:set)
	{
		if(entry.getValue()>=1)
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
}
