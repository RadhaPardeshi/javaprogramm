package Patterns;

public class Pattern18 {
	public static void main(String[] args) {
		int n=4;
		
		for(int i=0;i<n;i++)
		{
		  char ch='A'; int a=1;
	       for(int j=0;j<n;j++)
			{	
				if(i%2==0)
				{   
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print(a+" ");
					a++;
				}
			}
	       
			System.out.println();
		}	
	}

}
