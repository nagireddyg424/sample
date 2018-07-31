package sample.com.java.sample;

import java.util.LinkedHashMap;

public class LongSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long stime=System.nanoTime();
		int i;
		String name="javaconceptoftheday";
		char ch[]=name.toCharArray();
		String longSubstring =null;
		int longSubstringLength=0;
		LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<Character,Integer>();
		for(i=0;i<ch.length;i++)
		{
			char chr=ch[i];
			if(!lhm.containsKey(chr))
			{
				lhm.put(chr, i);
			}
			else
			{
				i=lhm.get(chr);
				System.out.print(i+": ");
				lhm.clear();
				System.out.print(lhm+" ");
			}
			if(lhm.size()>longSubstringLength)
			{
				longSubstringLength=lhm.size();
				longSubstring=lhm.keySet().toString();
			}
		}
		System.out.println(name);
		System.out.println(longSubstring);
		System.out.println(longSubstringLength);
		long etime=System.nanoTime();
		long total=etime-stime;
		double seconds = (double)total / 1000000000.0;
		System.out.println("The execution time is:"+seconds);

	}

}
