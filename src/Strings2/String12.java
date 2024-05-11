package Strings2;

public class String12 {
   public static void main(String[] args) {
	
	  String s = "JAVA";
	  char[] ch = s.toCharArray();
	  
	  for(int i=0;i<ch.length;i++)
	  {
		  String str =" ";
		  for(int j=i;j<ch.length;j++)
		  {
			  str=str+ch[j];
			  System.out.println(str);
		  }
		  
		  
	  }
}
}
