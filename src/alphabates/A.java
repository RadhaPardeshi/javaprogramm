package alphabates;

public class A {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			//A
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n/2||j==0||j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			//B
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n/2||j==0||j==n-1||i==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			//C
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			//D
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			//E
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||i==2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			//F
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			//G
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||i>n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			//H
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			//I
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			//J
			for(int j=0;j<n;j++)
			{
				if(i==0||j==2||i==n-1&&j<=n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			//K
			for(int j=0;j<n;j++)
			{
				
			}
			System.out.print(" ");
			//P
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n/2||j==0||j==n-1&&i<=n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			//R
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n/2||j==0||j==n-1&&i<=n/2||i==3 &&j==2||i==4 && j==3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			
			
			
		}
	}
}
