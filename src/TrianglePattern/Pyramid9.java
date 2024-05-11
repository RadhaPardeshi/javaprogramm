package TrianglePattern;

public class Pyramid9 {
	public static void main(String[] args) {
	int n=4;
	for(int i=1;i<=n;i++)
	{
		int a=1;
		for(int j=0;j<n-i;j++)
		{
			System.out.print("  ");
		}
		for(int j=1;j<=(2*i-1);j++)
		{
			if(j%2==0)
				System.out.print(a-1+" ");
			else
			System.out.print(a+" ");
		
		}
		System.out.println();	
	}
	}
}
