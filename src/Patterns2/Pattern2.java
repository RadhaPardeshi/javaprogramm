package Patterns2;

public class Pattern2 {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++)
		{
			char ch='a';
			int a=1;
			for(int j=0;j<n;j++)
			{
				if(i>=j && i==1||i==3) 
				{
					System.out.print(ch+++" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		
		}
	}
}
