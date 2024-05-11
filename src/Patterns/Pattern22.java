package Patterns;

public class Pattern22 {
	public static void main(String[] args) {
		int n=4;
		char ch='A'; int a=1;
		for(int i=0;i<n;i++)
		{
		  
	       for(int j=0;j<n;j++)
			{	
				if(i%2==0)
				{   
					System.out.print(ch+" ");
				}
				else
				{
					System.out.print(a+" ");
				}
			}
	       if(i%2==0)
	    	   ch++;
	       else
	    	   a++;
			System.out.println();
		}	
	}
}
