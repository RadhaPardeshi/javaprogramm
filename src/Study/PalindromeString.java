package Study;

public class PalindromeString {
	public static void main(String[] args) {
		String s = "Malayalam";
		char[]ch=s.toCharArray();
		String st="";
		for(int i=ch.length-1;i>=0;i--)
		{
			st=st+ch[i];
		}
		//System.out.println(st);
		if(s.equalsIgnoreCase(st))
			System.out.println(s+" is a Palindrome String");
		else
			System.out.println(s+" is not a palindrome string");
	}

}
