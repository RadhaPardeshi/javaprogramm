package Study;

public class ReverseAString {
	public static void main(String[] args) {
		String s = "Welcome";
		String st="";
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			st=st+s.charAt(i);
			
		}
      System.out.println(st);
	}

}
