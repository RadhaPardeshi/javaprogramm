package Strings2;

public class Test11 {
	public static void main(String[] args) {
		String s="Java is the Object Oriented Programming Language";
		char []ch=s.toCharArray();
		int count=1;
		String str="";
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]== ' ') 
			{
			    count++;	
			}
			else
			{
				
				str=str+ch[i]+" ";
			}
		}
		System.out.println(str+ " contains words :"+ count);
	}
}
