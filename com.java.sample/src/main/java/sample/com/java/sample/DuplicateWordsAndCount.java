package sample.com.java.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWordsAndCount {
	public static void main(String args[])
	{
		String str;
		Map<String, Integer> map=new HashMap<String,Integer>();
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String words[]=str.split(" ");
		for(String word:words)
		{
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}
			else
			{
				map.put(word, 1);
			}
		}
		
		Set<Map.Entry<String, Integer>> set=map.entrySet();
		for(Map.Entry<String, Integer> entry:set)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
	}

}
