package TrianglePattern;

public class Pyramid4 {
	public static void main(String[] args) {
		int n=4;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=0;j<n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print(a+" ");
			}
			System.out.println();
			a++;
			
		}
	}

}
