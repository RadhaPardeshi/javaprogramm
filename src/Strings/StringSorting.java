package Strings;

public class StringSorting {
	public static void main(String[] args) {
		String s="abc123@xy%7+";
		char []ch=s.toCharArray();
	    String alpha="";
	    String numb="";
	    String spec="";
	    for(int i=0;i<ch.length;i++)
	    {
	    	if(ch[i]>='a'&& ch[i]<='z')
	    	{
	    		alpha=alpha+ch[i];
	    	}
	    	else if(ch[i]>='0' && ch[i]<='9')
	    	{
	    		numb=numb+ch[i];
	    	}
	    	else
	    	{
	    		spec=spec+ch[i];
	    	}
	    }
	    System.out.println("Characters :"+alpha);
	    System.out.println("Numbers :"+numb);
	    System.out.println("Special Characters :"+spec);
	}

}
