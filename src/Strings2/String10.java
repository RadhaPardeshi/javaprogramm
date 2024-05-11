package Strings2;

public class String10 {
	public static void main(String[] args) {
		String s= "All the best for interview";
		int count=0;
		char [] ch =s.toCharArray();
	    for(int i=0;i<ch.length;i++)
	    {
	    	if(i==0 && ch[i]!=' ' || ch[i] != ' ' && ch[i-1]==' ')
	    	{
	    		count++;
	    	}
	    }
	    System.out.println(count);
	}

}
