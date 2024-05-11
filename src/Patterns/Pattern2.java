package Patterns;

public class Pattern2 {
	public static void main(String[] args) {
		int n=4; int a=1; char ch='A';

		for(int i=0;i<n;i++)
		{

			for(int j=0;j<n;j++)
			{
				if(ch<='D')
				{
					System.out.print(ch+" ");
					ch++;
				}
				else if(a<=n)
				{
					System.out.print(a+" ");
					a++;
				}
				else if (ch<='H')
				{
					System.out.print(ch +" ");
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

		System.out.println();
	}
}

