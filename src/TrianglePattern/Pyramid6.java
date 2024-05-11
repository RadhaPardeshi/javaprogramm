package TrianglePattern;

public class Pyramid6 {
	public static void main(String[] args) {
		int n=4;
		
		char ch='a';
		for(int i=1;i<=n;i++)
		{
			int a=1;
			for(int j=0;j<n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				if(i%2!=0)
				{
				System.out.print(ch+" ");
				}
			}
			
			for(int j=1;j<=(2*i-1);j++)
			{
				if(i%2==0) {
				System.out.print(a+" ");
				}
			}
			System.out.println();
			if(i%2==0)
				ch++;
			else
				a++;
				
		}
	}

}
