package Patterns;

public class Pattern24 {
	public static void main(String[] args) {
		int n=4;
		int a=1; char ch='a';
		int space=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=a;j++)
			{
				System.out.print(a);
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			System.out.println();
			a++;
			space--;
		}
	}

}
