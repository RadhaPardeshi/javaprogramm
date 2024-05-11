package Strings2;

public class String14 {
	public static void main(String[] args) {
		String s1="JAVA";
		String s2="SELENIUM";
		System.out.println("Before swapping");
		System.out.println("S1 :"+s1);
		System.out.println("S2 :"+s2);
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After swapping");
		System.out.println("S1 :"+s1);
		System.out.println("S2 :"+s2);
	}
}
