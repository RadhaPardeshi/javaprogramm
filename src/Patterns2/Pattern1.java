package Patterns2;

public class Pattern1 {
	public static void main(String[] args) {
		int n=5;

		for(int i=0;i<n;i++)
		{
			int a=1;
			for(int j=0;j<n;j++)
			{
				if(i<=j) {
					System.out.print(a);
					a++;
				}
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

}
