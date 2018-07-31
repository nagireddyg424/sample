package sample.com.java.sample;

public class SwapWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1="Nagi";
    String s2="Veera";
    s1=s1+s2;
    System.out.println("after add strings:"+s1);
    s2=s1.substring(0,s1.length()-s2.length());
    System.out.println("after substring s2 is:"+s2);
    s1=s1.substring(s2.length());
    System.out.println("after substring s1 is:"+s1);
   // System.out.print("s1:"+s1+" "+"s2:"+s2);
   // s2=s1-s2;
	/*	int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print(a+" "+b);*/
	}

}
