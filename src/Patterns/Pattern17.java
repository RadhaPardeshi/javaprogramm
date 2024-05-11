package Patterns;

public class Pattern17 {
	public static void main(String[] args) {
		int n=4;int a=1;
		for(int i=0;i<n;i++)
		{
			
			char ch='A'; 
			for(int j=0;j<n;j++)
			{	
				if(j%2==0)
				{   
					System.out.print(ch+++" ");
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
