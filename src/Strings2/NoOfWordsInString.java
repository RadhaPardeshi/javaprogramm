package Strings2;

public class NoOfWordsInString {
	public static void main(String[] args) {
		String s="Java is the Object Oriented Programming Language";
		char []ch=s.toCharArray();
		int count=1;
		for(int i=0;i<ch.length-1;i++)
		{
			if(s.charAt(i)==' ') 
			{
			    count++;	
			}
		}
		System.out.println(count);
	}

}
