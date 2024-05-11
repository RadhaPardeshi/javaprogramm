package Strings2;

public class String11 {
	public static void main(String[] args) {
		String s="JAVA";
		char []ch =s.toCharArray();
		String str="";
		for(int i=0;i<ch.length;i++)
		{
			str=str+ch[i];
			System.out.println(str);
		}
	}

}